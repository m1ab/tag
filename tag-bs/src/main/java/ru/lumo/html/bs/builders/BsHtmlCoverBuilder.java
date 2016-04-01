/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.builders;

import ru.lumo.html.bs.tag.BsForm;
import ru.lumo.html.bs.tag.LinkItem;
import ru.lumo.html.producers.DefaultBsPageProducer;
import ru.lumo.html.tag.Html;

import javax.inject.Inject;
import java.util.List;

/**
 *
 * @author misha
 * @param <P>
 */
public class BsHtmlCoverBuilder<P extends DefaultBsPageProducer> extends BsBuilder<P, Html> {

    @Inject
    private BsHeadBuilder<P> headBuilder;
    @Inject
    private BsBodyCoverBuilder<P> bodyBuilder;

    private List<LinkItem> items;
    private List<Object> contentList;
    private List<String> counters;
    private BsForm form;

    public BsHtmlCoverBuilder<P> setItems(List<LinkItem> items) {
        this.items = items;
        return this;
    }

    public BsHtmlCoverBuilder<P> setMenuForm(BsForm form) {
        this.form = form;
        return this;
    }

    public BsHtmlCoverBuilder<P> setContentList(List<Object> contentList) {
        this.contentList = contentList;
        return this;
    }

    public BsHtmlCoverBuilder<P> setCounters(List<String> counters) {
        this.counters = counters;
        return this;
    }

    @Override
    public void setProducer(P producer) {
        this.producer = producer;
        headBuilder.setProducer(producer);
        bodyBuilder.setProducer(producer);
    }

    public Html build() {
        Html html = new Html(producer.getLang());
        html.add(headBuilder.build());
        html.add(bodyBuilder
                .setMenu(items)
                .setMenuForm(form)
                .setCounters(counters)
                .setContentList(contentList)
                .build());
        return html;
    }
}
