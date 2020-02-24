/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

import java.util.List;

import com.mizhgan.tag.Lit;
import com.mizhgan.tag.util.ItemUtils;

/**
 *
 * @author mizhgan
 */
public class CompLiNavbarDropdown extends BsLi {

    private ItemUtils itemUtils;

    public CompLiNavbarDropdown() {
        this(null);
        itemUtils = new ItemUtils();
    }
    
    public CompLiNavbarDropdown(List<Visibility> visibilities) {
        super("dropdown");
        itemUtils = new ItemUtils();
        if (visibilities != null && !visibilities.isEmpty()) {
            for (Visibility visibility : visibilities) {
                addClass(visibility.toString());
            }
        }
        add(new Lit());
    }
    
    public void setDropdownName(String name) {
        BsA a = new BsA("dropdown-toggle");
        a.putAttribute("data-toggle", "dropdown");
        a.add(new Lit(name == null ? "" : name + " "));
        a.add(new CompBCaret());
        add(a);
    }

    public void setDropdownMenu(List<LinkItem> items) {
        BsUl ul = new BsUl("dropdown-menu");
        if (items != null && !items.isEmpty()) {
            for (LinkItem item : items) {
                if (item.getName() == null) {
                    ul.add(new CompLiDivider());
                } else {
                    ul.add(makeNavbarLink(item));
                }
            }
        }
        add(ul);
    }
    
    private CompLiNavbarLink makeNavbarLink(LinkItem item) {
        return item.isActive()
                ? new CompLiNavbarLink("active", itemUtils.makeItemName(item), null)
                : new CompLiNavbarLink(itemUtils.makeItemName(item), item.getLink());
    }
    
}
