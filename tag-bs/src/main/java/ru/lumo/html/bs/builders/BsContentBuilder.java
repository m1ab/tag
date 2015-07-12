/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.builders;

import java.util.ArrayList;
import java.util.List;
import ru.lumo.html.bs.tag.BsDivCol;
import ru.lumo.html.bs.tag.BsDivRow;
import ru.lumo.html.bs.tag.BsDivTemplate;
import ru.lumo.html.bs.tag.CompDivContent;
import ru.lumo.html.bs.tag.Grid;
import ru.lumo.html.producers.DefaultBsPageProducer;
import ru.lumo.html.tag.Tag;
import static ru.lumo.html.bs.tag.Grid.Screen;
import static ru.lumo.html.bs.tag.Grid.Size;
/**
 *
 * @author misha
 * @param <P>
 */
public class BsContentBuilder<P extends DefaultBsPageProducer> extends BsBuilder<P, CompDivContent> {

    private List<Object> contentList;
    private List<Object> sideList;

    public BsContentBuilder<P> setContentList(List<Object> contentList) {
        this.contentList = contentList;
        return this;
    }

    public BsContentBuilder<P>  setSideList(List<Object> sideList) {
        this.sideList = sideList;
        return this;
    }

    public CompDivContent build() {
        CompDivContent container = new CompDivContent();
        if (sideList != null) {
            container.getTemplate().add(makeRow(contentList, sideList));
            return container;
        }
        BsDivTemplate template = container.getTemplate();
        for (Object obj : contentList) {
            if (obj instanceof String) template.add((String)obj);
            if (obj instanceof Tag) template.add((Tag)obj);
        }
        return container;
    }
    
    private BsDivRow makeRow(List<Object> contentList, List<Object> sideList) {
        BsDivRow row = new BsDivRow();
        if (contentList != null) {
            row.add(makeCol(contentList, makeMainGrid()));
        }
        if (sideList != null) {
            row.add(makeCol(sideList, makeSideGrid()));
        }
        return row;
    }
    
    private BsDivCol makeCol(List<Object> list, List<Grid> grid) {
        BsDivCol col = new BsDivCol(null, grid);
        for (Object obj : list) {
            if (obj instanceof String) col.add((String)obj);
            if (obj instanceof Tag) col.add((Tag)obj);
        }
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
