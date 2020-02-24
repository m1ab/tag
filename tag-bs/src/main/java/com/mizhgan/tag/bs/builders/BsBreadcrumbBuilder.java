/*
 * No fuck license
 */

package com.mizhgan.tag.bs.builders;

import com.mizhgan.tag.bs.tag.BsOlBreadcrumb;
import com.mizhgan.tag.bs.tag.CompLiLink;
import com.mizhgan.tag.bs.tag.LinkItem;
import com.mizhgan.tag.producers.BsPageProducer;

import java.util.List;

/**
 * @param <P>
 * @author mizhgan
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
