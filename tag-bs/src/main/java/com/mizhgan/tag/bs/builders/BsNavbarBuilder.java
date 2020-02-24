/*
 * No fuck license
 */

package com.mizhgan.tag.bs.builders;

import com.mizhgan.tag.Lit;
import com.mizhgan.tag.bs.tag.*;
import com.mizhgan.tag.producers.BsPageProducer;

import java.util.List;

import static com.mizhgan.tag.bs.tag.BsDivContainer.View.container;
import static com.mizhgan.tag.bs.tag.BsNav.Type.navbar_fixed_top;
import static com.mizhgan.tag.bs.tag.BsNav.View.navbar_default;
import static com.mizhgan.tag.bs.tag.BsNav.View.navbar_inverse;

/**
 * @param <P>
 * @author mizhgan
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
