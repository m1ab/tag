/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.builders;

import java.util.List;
import ru.lumo.html.bs.tag.LinkItem;
import ru.lumo.html.producers.DefaultBsPageProducer;
import ru.lumo.html.tag.Html;

import javax.inject.Inject;

/**
 *
 * @author misha
 * @param <P>
 */
public class BsHtmlBuilder<P extends DefaultBsPageProducer> extends BsBuilder<P, Html> {

    @Inject
    private BsHeadBuilder<P> headBuilder;
    @Inject
    private BsBodyBuilder<P> bodyBuilder;

    private List<LinkItem> items;
    private List<LinkItem> breadcrumb;
    private List<Object> contentList;
    private List<Object> sideList;
    private List<String> counters;

    public BsHtmlBuilder<P> setItems(List<LinkItem> items) {
        this.items = items;
        return this;
    }

    public BsHtmlBuilder<P> setBreadcrumb(List<LinkItem> breadcrumb) {
        this.breadcrumb = breadcrumb;
        return this;
    }

    public BsHtmlBuilder<P> setContentList(List<Object> contentList) {
        this.contentList = contentList;
        return this;
    }

    public BsHtmlBuilder<P> setSideList(List<Object> sideList) {
        this.sideList = sideList;
        return this;
    }

    public BsHtmlBuilder<P> setCounters(List<String> counters) {
        this.counters = counters;
        return this;
    }

    @Override
    public void setProducer(P producer) {
        headBuilder.setProducer(producer);
        bodyBuilder.setProducer(producer);
    }

    public Html build() {
        Html html = new Html(producer.getLang());
        html.add(headBuilder.build());
        html.add(bodyBuilder
                .setMenu(items)
                .setCounters(counters)
                .setItems(breadcrumb)
                .setContentList(contentList)
                .setSideList(sideList).build());
        return html;
    }
}
