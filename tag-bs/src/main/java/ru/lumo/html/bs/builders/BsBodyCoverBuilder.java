/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.builders;

import ru.lumo.html.bs.tag.BsForm;
import ru.lumo.html.bs.tag.LinkItem;
import ru.lumo.html.producers.DefaultBsPageProducer;
import ru.lumo.html.tag.Body;
import ru.lumo.html.tag.Script;

import javax.inject.Inject;
import java.util.List;

/**
 *
 * @author misha
 * @param <P>
 */
public class BsBodyCoverBuilder<P extends DefaultBsPageProducer> extends BsBuilder<P, Body> {

    @Inject
    private BsNavbarBuilder<P> navbarBuilder;
    @Inject
    private BsCoverContentBuilder<P> contentBuilder;
    @Inject
    private BsJsBuilder<P> jsBuilder;

    private List<String> counters;
    private List<Object> contentList;

    @Override
    public void setProducer(P producer) {
        this.producer = producer;
        navbarBuilder.setProducer(producer);
        contentBuilder.setProducer(producer);
        jsBuilder.setProducer(producer);
    }
    
    public BsBodyCoverBuilder<P> setMenu(List<LinkItem> items) {
        navbarBuilder.setMenu(items);
        return this;
    }

    public BsBodyCoverBuilder<P> setMenuForm(BsForm form) {
        navbarBuilder.setForm(form);
        return this;
    }
    
    public BsBodyCoverBuilder<P> setCounters(List<String> counters) {
        this.counters = counters;
        return this;
    }

    public BsBodyCoverBuilder<P> setContentList(List<Object> contentList) {
        this.contentList = contentList;
        return this;
    }

    public Body build() {
        Body body = new Body();
        body.add(navbarBuilder.buildInverseFixedTopNavbar());
        body.add(contentBuilder.setContentList(contentList).build());
        //
        body.add("<!-- Bootstrap core JavaScript ================================================== -->");
        for (Script script : jsBuilder.build()) {
            body.add(script);
        }
        if (counters != null && !counters.isEmpty()) {
            for (String counter : counters) {
                body.add(counter);
            }
        }
        return body;
    }
}
