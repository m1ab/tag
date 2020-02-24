/*
 * No fuck license
 */

package com.mizhgan.tag.bs.builders;

import com.mizhgan.tag.Body;
import com.mizhgan.tag.Lit;
import com.mizhgan.tag.bs.tag.BsForm;
import com.mizhgan.tag.bs.tag.LinkItem;
import com.mizhgan.tag.producers.BsPageProducer;

import java.util.List;

/**
 * @param <P>
 * @author mizhgan
 */
public class BsBodyCoverBuilder<P extends BsPageProducer> extends AbstractBsBuilder<P, Body> {

    private BsNavbarBuilder<P> navbarBuilder;
    private BsCoverContentBuilder<P> contentBuilder;
    private BsJsBuilder<P> jsBuilder;

    private List<String> counters;
    private List<Lit> contentList;

    public BsBodyCoverBuilder(P producer) {
        super(producer);
        navbarBuilder = new BsNavbarBuilder<>(producer);
        contentBuilder = new BsCoverContentBuilder<>(producer);
        jsBuilder = new BsJsBuilder<>(producer);
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

    public BsBodyCoverBuilder<P> setContentList(List<Lit> contentList) {
        this.contentList = contentList;
        return this;
    }

    @Override
    public Body build() {
        Body body = new Body();
        body.add(navbarBuilder.buildInverseFixedTopNavbar());
        body.add(contentBuilder.setContentList(contentList).build());
        body.add(new Lit("<!-- Bootstrap core JavaScript ================================================== -->"));
        jsBuilder.build().forEach(script -> body.add(script));
        if (counters == null || counters.isEmpty()) return body;
        counters.forEach(counter -> body.add(new Lit(counter)));
        return body;
    }
}
