/*
 * No fuck license
 */

package com.mizhgan.tag.bs.builders;

import com.mizhgan.tag.Lit;
import com.mizhgan.tag.bs.tag.BsDivCoverContainer;
import com.mizhgan.tag.bs.tag.BsDivSiteWrapper;
import com.mizhgan.tag.producers.BsPageProducer;

import java.util.List;

/**
 * @param <P>
 * @author mizhgan
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
