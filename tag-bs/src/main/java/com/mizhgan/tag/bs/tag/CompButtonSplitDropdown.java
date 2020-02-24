/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

import com.mizhgan.tag.Lit;
import com.mizhgan.tag.util.ItemUtils;

import java.util.List;

/**
 *
 * @author mizhgan
 */
public class CompButtonSplitDropdown extends BsDiv {

    private ItemUtils itemUtils;
    private String id;
    private String expanded = "false";
    private String hasPopup = "true";
    private StyleButton styleButton = StyleButton.DEFAULT;
    private boolean disabled = false;

    public CompButtonSplitDropdown(String id) {
        this(id, null);
        itemUtils = new ItemUtils();
    }

    public CompButtonSplitDropdown(String id, List<Visibility> visibilities) {
        super("btn-group");
        putAttribute("role", "group");
        this.id = id;
        itemUtils = new ItemUtils();
        if (visibilities != null && !visibilities.isEmpty()) {
            for (Visibility visibility : visibilities) {
                addClass(visibility.toString());
            }
        }
        add(new Lit());
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
        BsButton button;
        //
        button = new BsButton(BsButton.Type.BUTTON, styleButton.getName());
        button.add(name == null ? "" : name + " ");
        add(button);
        //
        button = new BsButton(BsButton.Type.BUTTON, "dropdown-toggle");
        button.addClass(styleButton.getName());
        button.putAttribute("id", id);
        button.putAttribute("data-toggle", "dropdown");
        button.putAttribute("aria-haspopup", hasPopup);
        button.putAttribute("aria-expanded", expanded);
        button.add(new CompSpanCaret());
        button.add(" ");
        BsSpan span = new BsSpan("sr-only");
        span.add("Toggle Dropdown");
        button.add(span);
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
