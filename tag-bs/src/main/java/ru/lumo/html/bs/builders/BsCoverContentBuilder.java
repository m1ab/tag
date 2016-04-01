/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.builders;

import ru.lumo.html.bs.tag.*;
import ru.lumo.html.producers.DefaultBsPageProducer;
import ru.lumo.html.tag.Tag;

import java.util.ArrayList;
import java.util.List;

import static ru.lumo.html.bs.tag.Grid.Screen;
import static ru.lumo.html.bs.tag.Grid.Size;

/**
 *
 * @author misha
 * @param <P>
 */
public class BsCoverContentBuilder<P extends DefaultBsPageProducer> extends BsBuilder<P, BsDivSiteWrapper> {

    private List<Object> contentList;

    public BsCoverContentBuilder<P> setContentList(List<Object> contentList) {
        this.contentList = contentList;
        return this;
    }

    public BsDivSiteWrapper build() {
        BsDivSiteWrapper siteWrapper = new BsDivSiteWrapper();
        BsDivCoverContainer coverContainer = siteWrapper.getCoverContainer();
        contentList.forEach(item -> append(coverContainer, item));
        return siteWrapper;
    }

    private void append(BsDivCoverContainer coverContainer, Object item) {
        if (item instanceof String) coverContainer.add((String)item);
        if (item instanceof Tag) coverContainer.add((Tag)item);
    }
}
