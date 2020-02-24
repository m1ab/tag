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
public class BsHtmlCoverBuilder<P extends BsPageProducer> extends AbstractBsBuilder<P, Html> {

    private BsHeadBuilder<P> headBuilder;
    private BsBodyCoverBuilder<P> bodyBuilder;

    private List<LinkItem> items;
    private List<Lit> contentList;
    private List<String> counters;
    private BsForm form;

    public BsHtmlCoverBuilder(P producer) {
        super(producer);
        headBuilder = new BsHeadBuilder<>(producer);
        bodyBuilder = new BsBodyCoverBuilder<>(producer);
    }

    public BsHtmlCoverBuilder<P> setItems(List<LinkItem> items) {
        this.items = items;
        return this;
    }

    public BsHtmlCoverBuilder<P> setMenuForm(BsForm form) {
        this.form = form;
        return this;
    }

    public BsHtmlCoverBuilder<P> setContentList(List<Lit> contentList) {
        this.contentList = contentList;
        return this;
    }

    public BsHtmlCoverBuilder<P> setCounters(List<String> counters) {
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
                .setContentList(contentList)
                .build());
        return html;
    }
}
