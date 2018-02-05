/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.builders;

import ru.lumo.html.bs.tag.BsOlBreadcrumb;
import ru.lumo.html.bs.tag.CompLiLink;
import ru.lumo.html.bs.tag.LinkItem;
import ru.lumo.html.producers.BsPageProducer;

import java.util.List;

/**
 *
 * @author misha
 * @param <P>
 */
public class BsBreadcrumbBuilder<P extends BsPageProducer> extends AbstractBsBuilder<P, BsOlBreadcrumb> {

    private String name;
    private List<LinkItem> items;

    public BsBreadcrumbBuilder(P producer) {
        super(producer);
    }

    public BsBreadcrumbBuilder<P> setName(String name) {
        this.name = name;
        return this;
    }

    public BsBreadcrumbBuilder<P> setItems(List<LinkItem> items) {
        this.items = items;
        return this;
    }

    @Override
    public BsOlBreadcrumb build() {
        BsOlBreadcrumb breadcrumb = new BsOlBreadcrumb();
        breadcrumb.add(new CompLiLink(producer.getReturnHomeName(), producer.getBase()));
        if (items != null) {
            for (LinkItem item : items) {
                breadcrumb.add(item.isActive()
                        ? new CompLiLink("active", item.getName(), null)
                        : new CompLiLink(item.getName(), item.getLink()));
            }
        } else if (name != null) {
            breadcrumb.add(new CompLiLink("active", name, null));
        }
        return breadcrumb;
    }
}
