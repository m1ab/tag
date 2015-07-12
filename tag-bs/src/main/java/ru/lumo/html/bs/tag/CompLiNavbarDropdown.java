/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.tag;

import java.util.List;
import ru.lumo.html.util.ItemUtils;

import javax.inject.Inject;

/**
 *
 * @author misha
 */
public class CompLiNavbarDropdown extends BsLi {

    @Inject
    private ItemUtils itemUtils;

    public CompLiNavbarDropdown() {
        this(null);
    }
    
    public CompLiNavbarDropdown(List<Visibility> visibilities) {
        super("dropdown");
        if (visibilities != null && !visibilities.isEmpty()) {
            for (Visibility visibility : visibilities) {
                addClass(visibility.toString());
            }
        }
        add("");
    }
    
    public void setDropdownName(String name) {
        BsA a = new BsA("dropdown-toggle");
        a.putAttribute("data-toggle", "dropdown");
        a.add(name == null ? "" : name);
        a.add(" ");
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
