/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizhgan.html.bs.builders;

import com.mizhgan.html.producers.BsPageProducer;
import com.mizhgan.html.bs.tag.*;
import com.mizhgan.html.tag.Lit;

import java.util.List;

import static com.mizhgan.html.bs.tag.BsDivContainer.View.container;
import static com.mizhgan.html.bs.tag.BsNav.Type.navbar_fixed_top;
import static com.mizhgan.html.bs.tag.BsNav.View.navbar_default;
import static com.mizhgan.html.bs.tag.BsNav.View.navbar_inverse;

/**
 *
 * @author mizhgan, 11.11.2019
 * @param <P>
 */
public class BsNavbarBuilder<P extends BsPageProducer> extends AbstractBsBuilder<P, BsNav> {

    private List<LinkItem> items;
    private BsNav.View view;
    private BsNav.Type type;
    private BsForm form;

    public BsNavbarBuilder(P producer) {
        super(producer);
    }

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

    @Override
    public BsNav build() {
        BsNav nav = new BsNav(view, type);
        BsDivContainer div = new BsDivContainer(container);
        div.add(new Lit("<!-- Brand and toggle get grouped for better mobile display -->"));
        CompDivNavbarHeader header = new CompDivNavbarHeader();
        header.addBrand(producer.getBrand(), 
                producer.getBrandTitle(), producer.getBrandLink());
        div.add(header);
        
        div.add(new Lit("<!-- Collect the nav links, forms, and other content for toggling -->"));
        CompDivNavbarCollapse collapse = new CompDivNavbarCollapse(items, form);
        div.add(collapse);
        
        nav.add(div);
        return nav;
    }
    
    public BsNav buildDefaultFixedTopNavbar() {
        return setView(navbar_default).setType(navbar_fixed_top).build();
    }
    
    public BsNav buildInverseFixedTopNavbar() {
        return setView(navbar_inverse).setType(navbar_fixed_top).build();
    }
}
