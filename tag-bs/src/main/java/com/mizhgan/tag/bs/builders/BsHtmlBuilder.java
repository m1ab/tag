/*
 * No fuck license
 */

package com.mizhgan.tag.bs.builders;

import com.mizhgan.tag.Html;
import com.mizhgan.tag.Lit;
import com.mizhgan.tag.bs.tag.BsForm;
import com.mizhgan.tag.bs.tag.LinkItem;
import com.mizhgan.tag.producers.BsPageProducer;

import java.util.List;

/**
 * @param <P>
 * @author mizhgan
 */
public class BsHtmlBuilder<P extends BsPageProducer> extends AbstractBsBuilder<P, Html> {

    private BsHeadBuilder<P> headBuilder;
    private BsBodyBuilder<P> bodyBuilder;

    private List<LinkItem> items;
    private List<LinkItem> breadcrumb;
    private List<Lit> contentList;
    private List<Lit> sideList;
    private List<String> counters;
    private BsForm form;

    public BsHtmlBuilder(P producer) {
        super(producer);
        headBuilder = new BsHeadBuilder<>(producer);
        bodyBuilder = new BsBodyBuilder<>(producer);
    }

    public BsHtmlBuilder<P> setItems(List<LinkItem> items) {
        this.items = items;
        return this;
    }

    public BsHtmlBuilder<P> setMenuForm(BsForm form) {
        this.form = form;
        return this;
    }

    public BsHtmlBuilder<P> setBreadcrumb(List<LinkItem> breadcrumb) {
        this.breadcrumb = breadcrumb;
        return this;
    }

    public BsHtmlBuilder<P> setContentList(List<Lit> contentList) {
        this.contentList = contentList;
        return this;
    }

    public BsHtmlBuilder<P> setSideList(List<Lit> sideList) {
        this.sideList = sideList;
        return this;
    }

    public BsHtmlBuilder<P> setCounters(List<String> counters) {
        this.counters = counters;
        return this;
    }

    @Override
    public Html build() {
        Html html = new Html(producer.getLang());
        html.add(headBuilder.build());
        html.add(bodyBuilder
                .setMenu(items)
                .setMenuForm(form)
                .setCounters(counters)
                .setItems(breadcrumb)
                .setContentList(contentList)
                .setSideList(sideList).build());
        return html;
    }
}
