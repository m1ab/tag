/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.builders;

import java.util.List;

import ru.lumo.html.bs.tag.*;
import ru.lumo.html.producers.DefaultBsPageProducer;

import javax.inject.Inject;

import static ru.lumo.html.bs.tag.BsDivContainer.View.CONTAINER;
import static ru.lumo.html.bs.tag.BsNav.Type.FIXED_TOP;
import static ru.lumo.html.bs.tag.BsNav.View.DEFAULT;
import static ru.lumo.html.bs.tag.BsNav.View.INVERSE;

/**
 *
 * @author misha
 * @param <P>
 */
public class BsNavbarBuilder<P extends DefaultBsPageProducer> extends BsBuilder<P, BsNav> {

    @Inject
    private CompDivNavbarCollapse collapse;

    private List<LinkItem> items;
    private BsNav.View view;
    private BsNav.Type type;
    private BsForm form;

    public BsNavbarBuilder<P> setMenu(List<LinkItem> items) {
        this.items = items;
        return this;
    }

    public BsNavbarBuilder<P> setView(BsNav.View view) {
        this.view = view;
        return this;
    }

    public BsNavbarBuilder<P> setType(BsNav.Type type) {
        this.type = type;
        return this;
    }

    public BsNavbarBuilder<P> setForm(BsForm form) {
        this.form = form;
        return this;
    }

    public BsNav build() {
        BsNav nav = new BsNav(view, type);
        BsDivContainer container = new BsDivContainer(CONTAINER);
        container.add("<!-- Brand and toggle get grouped for better mobile display -->");
        CompDivNavbarHeader header = new CompDivNavbarHeader();
        header.addBrand(producer.getBrand(), 
                producer.getBrandTitle(), producer.getBrandLink());
        container.add(header);
        
        container.add("<!-- Collect the nav links, forms, and other content for toggling -->");
        CompDivNavbarCollapse collapse = new CompDivNavbarCollapse(items, form);
        container.add(collapse);
        
        nav.add(container);
        return nav;
    }
    
    public BsNav buildDefaultFixedTopNavbar() {
        return setView(DEFAULT).setType(FIXED_TOP).build();
    }
    
    public BsNav buildInverseFixedTopNavbar() {
        return setView(INVERSE).setType(FIXED_TOP).build();
    }
}
