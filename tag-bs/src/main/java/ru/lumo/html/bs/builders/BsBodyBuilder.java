/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.builders;

import java.util.List;
import ru.lumo.html.bs.tag.LinkItem;
import ru.lumo.html.producers.DefaultBsPageProducer;
import ru.lumo.html.tag.Body;
import ru.lumo.html.tag.Script;

import javax.inject.Inject;

/**
 *
 * @author misha
 * @param <P>
 */
public class BsBodyBuilder<P extends DefaultBsPageProducer> extends BsBuilder<P, Body> {

    @Inject
    private BsNavbarBuilder<P> navbarBuilder;
    @Inject
    private BsBreadcrumbBuilder<P> breadcrumbBuilder;
    @Inject
    private BsContentBuilder<P> contentBuilder;
    @Inject
    private BsFooterBuilder<P> footerBuilder;
    @Inject
    private BsJsBuilder<P> jsBuilder;

    private List<String> counters;
    private List<LinkItem> items;
    private List<Object> contentList;
    private List<Object> sideList;

//    @Override
//    public void setProducer(P producer) {
//        navbarBuilder.setProducer(producer);
//        breadcrumbBuilder.setProducer(producer);
//        contentBuilder.setProducer(producer);
//        footerBuilder.setProducer(producer);
//        jsBuilder.setProducer(producer);
//    }
    
    public BsBodyBuilder<P> setMenu(List<LinkItem> items) {
        navbarBuilder.setMenu(items);
        return this;
    }
    
    public BsBodyBuilder<P> setCounters(List<String> counters) {
        this.counters = counters;
        return this;
    }

    public BsBodyBuilder<P> setItems(List<LinkItem> items) {
        this.items = items;
        return this;
    }

    public BsBodyBuilder<P> setContentList(List<Object> contentList) {
        this.contentList = contentList;
        return this;
    }

    public BsBodyBuilder<P> setSideList(List<Object> sideList) {
        this.sideList = sideList;
        return this;
    }

    public Body build() {
        if (items != null) {
            addBreadcrumb(contentList, items);
        }
        Body body = new Body();
        body.add(navbarBuilder.buildInverseFixedTopNavbar());
        body.add(contentBuilder.setContentList(contentList).setSideList(sideList).build());
        body.add(footerBuilder.build());
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
    
    private void addBreadcrumb(List<Object> contentList, List<LinkItem> items) {
        contentList.add(0, breadcrumbBuilder.setItems(items).build());
    }
}
