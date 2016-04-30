/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.builders;

import ru.lumo.html.bs.tag.BsDivCoverContainer;
import ru.lumo.html.bs.tag.BsDivSiteWrapper;
import ru.lumo.html.producers.DefaultBsPageProducer;
import ru.lumo.html.tag.Lit;

import java.util.List;

/**
 *
 * @author misha
 * @param <P>
 */
public class BsCoverContentBuilder<P extends DefaultBsPageProducer> extends BsBuilder<P, BsDivSiteWrapper> {

    private List<Lit> contentList;

    public BsCoverContentBuilder<P> setContentList(List<Lit> contentList) {
        this.contentList = contentList;
        return this;
    }

    public BsDivSiteWrapper build() {
        BsDivSiteWrapper siteWrapper = new BsDivSiteWrapper();
        BsDivCoverContainer coverContainer = siteWrapper.getCoverContainer();
        contentList.forEach(lit -> coverContainer.add(lit));
        return siteWrapper;
    }
}
