/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.tag;

import ru.lumo.html.bs.tag.*;
import ru.lumo.html.util.ItemUtils;

import java.util.List;

/**
 *
 * @author misha
 */
public class CompButtonDropdown extends BsDiv {

    private ItemUtils itemUtils;
    private String id;

    public CompButtonDropdown(String id) {
        this(id, null);
        itemUtils = new ItemUtils();
    }

    public CompButtonDropdown(String id, List<Visibility> visibilities) {
        super("dropdown");
        this.id = id;
        itemUtils = new ItemUtils();
        if (visibilities != null && !visibilities.isEmpty()) {
            for (Visibility visibility : visibilities) {
                addClass(visibility.toString());
            }
        }
        add("");
    }
    
    public void setDropdownName(String name) {
        setDropdownName(name, StyleButton.DEFAULT);
    }

    public void setDropdownName(String name, StyleButton style) {
        setDropdownName(name, "true", "true", style);
    }

    public void setDropdownName(String name, String hasPopup, String expanded, StyleButton style) {
        BsButton button = new BsButton(BsButton.Type.BUTTON, "dropdown-toggle");
        button.addClass(style.getName());
        button.putAttribute("id", id);
        button.putAttribute("data-toggle", "dropdown");
        button.putAttribute("aria-haspopup", hasPopup);
        button.putAttribute("aria-expanded", expanded);
        button.add(name == null ? "" : name);
        button.add(" ");
        button.add(new CompSpanCaret());
        add(button);
    }

    public void setDropdownMenu(List<LinkItem> items) {
        BsUl ul = new BsUl("dropdown-menu");
        ul.putAttribute("aria-labelledby", id);
        if (items != null && !items.isEmpty()) {
            for (LinkItem item : items) {
                if (item.getName() == null) {
                    ul.add(new CompLiDivider(true));
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
