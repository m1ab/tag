/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.builders;

import ru.lumo.html.bs.tag.BsForm;
import ru.lumo.html.bs.tag.LinkItem;
import ru.lumo.html.producers.BsPageProducer;
import ru.lumo.html.tag.Html;
import ru.lumo.html.tag.Lit;

import javax.inject.Inject;
import java.util.List;

/**
 *
 * @author misha
 * @param <P>
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
