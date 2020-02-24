/*
 * No fuck license
 */

package com.mizhgan.tag.bs.builders;

import com.mizhgan.tag.Lit;
import com.mizhgan.tag.bs.tag.*;
import com.mizhgan.tag.producers.BsPageProducer;

import java.util.ArrayList;
import java.util.List;

import static com.mizhgan.tag.bs.tag.Grid.Screen;
import static com.mizhgan.tag.bs.tag.Grid.Size;

/**
 * @param <P>
 * @author mizhgan
 */
public class BsContentBuilder<P extends BsPageProducer> extends AbstractBsBuilder<P, CompDivContent> {

    private List<Lit> contentList;
    private List<Lit> sideList;

    public BsContentBuilder(P producer) {
        super(producer);
    }

    public BsContentBuilder<P> setContentList(List<Lit> contentList) {
        this.contentList = contentList;
        return this;
    }

    public BsContentBuilder<P> setSideList(List<Lit> sideList) {
        this.sideList = sideList;
        return this;
    }

    @Override
    public CompDivContent build() {
        CompDivContent container = new CompDivContent();
        if (sideList != null) {
            container.getTemplate().add(makeRow(contentList, sideList));
            return container;
        }
        BsDivTemplate template = container.getTemplate();
        contentList.forEach(lit -> template.add(lit));
        return container;
    }

    private BsDivRow makeRow(List<Lit> contentList, List<Lit> sideList) {
        BsDivRow row = new BsDivRow();
        if (contentList != null) row.add(makeCol(contentList, makeMainGrid()));
        if (sideList != null) row.add(makeCol(sideList, makeSideGrid()));
        return row;
    }

    private BsDivCol makeCol(List<Lit> lits, List<Grid> grid) {
        BsDivCol col = new BsDivCol(null, grid);
        lits.forEach(lit -> col.add(lit));
        return col;
    }

    private List<Grid> makeMainGrid() {
        List<Grid> grids = new ArrayList<>();
        grids.add(new Grid(Screen.SMALL, Size.S7));
        grids.add(new Grid(Screen.MEDIUM, Size.S8));
        grids.add(new Grid(Screen.LARGE, Size.S9));
        return grids;
    }

    private List<Grid> makeSideGrid() {
        List<Grid> grids = new ArrayList<>();
        grids.add(new Grid(Screen.SMALL, Size.S5));
        grids.add(new Grid(Screen.MEDIUM, Size.S4));
        grids.add(new Grid(Screen.LARGE, Size.S3));
        return grids;
    }
}
