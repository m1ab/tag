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
public class BsBodyBuilder<P extends BsPageProducer> extends AbstractBsBuilder<P, Body> {

    private BsNavbarBuilder<P> navbarBuilder;
    private BsBreadcrumbBuilder<P> breadcrumbBuilder;
    private BsContentBuilder<P> contentBuilder;
    private BsFooterBuilder<P> footerBuilder;
    private BsJsBuilder<P> jsBuilder;

    private List<String> counters;
    private List<LinkItem> items;
    private List<Lit> contentList;
    private List<Lit> sideList;

    public BsBodyBuilder(P producer) {
        super(producer);
        navbarBuilder = new BsNavbarBuilder<>(producer);
        breadcrumbBuilder = new BsBreadcrumbBuilder<>(producer);
        contentBuilder = new BsContentBuilder<>(producer);
        footerBuilder = new BsFooterBuilder<>(producer);
        jsBuilder = new BsJsBuilder<>(producer);
    }

    public BsBodyBuilder<P> setMenu(List<LinkItem> items) {
        navbarBuilder.setMenu(items);
        return this;
    }

    public BsBodyBuilder<P> setMenuForm(BsForm form) {
        navbarBuilder.setForm(form);
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

    public BsBodyBuilder<P> setContentList(List<Lit> contentList) {
        this.contentList = contentList;
        return this;
    }

    public BsBodyBuilder<P> setSideList(List<Lit> sideList) {
        this.sideList = sideList;
        return this;
    }

    public Body build() {
        addBreadcrumb(contentList, items);
        Body body = new Body();
        body.add(navbarBuilder.buildInverseFixedTopNavbar());
        body.add(contentBuilder.setContentList(contentList).setSideList(sideList).build());
        body.add(footerBuilder.build());
        body.add(new Lit("<!-- Bootstrap core JavaScript ================================================== -->"));
        jsBuilder.build().forEach(script -> body.add(script));
        if (counters == null || counters.isEmpty()) return body;
        counters.forEach(counter -> body.add(new Lit(counter)));
        return body;
    }

    private void addBreadcrumb(List<Lit> contentList, List<LinkItem> items) {
        if (items == null) return;
        contentList.add(0, breadcrumbBuilder.setItems(items).build());
    }
}
