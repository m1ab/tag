/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizhgan.html.bs.builders;

import com.mizhgan.html.producers.BsPageProducer;
import com.mizhgan.html.bs.tag.BsDivCoverContainer;
import com.mizhgan.html.bs.tag.BsDivSiteWrapper;
import com.mizhgan.html.tag.Lit;

import java.util.List;

/**
 *
 * @author mizhgan, 11.11.2019
 * @param <P>
 */
public class BsCoverContentBuilder<P extends BsPageProducer> extends AbstractBsBuilder<P, BsDivSiteWrapper> {

    private List<Lit> contentList;

    public BsCoverContentBuilder(P producer) {
        super(producer);
    }

    public BsCoverContentBuilder<P> setContentList(List<Lit> contentList) {
        this.contentList = contentList;
        return this;
    }

    @Override
    public BsDivSiteWrapper build() {
        BsDivSiteWrapper siteWrapper = new BsDivSiteWrapper();
        BsDivCoverContainer coverContainer = siteWrapper.getCoverContainer();
        contentList.forEach(lit -> coverContainer.add(lit));
        return siteWrapper;
    }
}
