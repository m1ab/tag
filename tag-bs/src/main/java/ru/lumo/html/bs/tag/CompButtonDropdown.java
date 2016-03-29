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
    private String expanded = "true";
    private String hasPopup = "true";
    private StyleButton styleButton = StyleButton.DEFAULT;
    private boolean disabled = false;

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
    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public void setExpanded(String expanded) {
        this.expanded = expanded;
    }

    public void setHasPopup(String hasPopup) {
        this.hasPopup = hasPopup;
    }

    public void setStyleButton(StyleButton styleButton) {
        this.styleButton = styleButton;
    }

    public void setDropdownName(String name) {
        BsButton button = new BsButton(BsButton.Type.BUTTON, "dropdown-toggle");
        button.addClass(styleButton.getName());
        button.putAttribute("id", id);
        button.putAttribute("data-toggle", "dropdown");
        button.putAttribute("aria-haspopup", hasPopup);
        button.putAttribute("aria-expanded", expanded);
        button.add(name == null ? "" : name);
        button.add(" ");
        button.add(new CompSpanCaret());
        if (disabled) button.addClass("disabled");
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
