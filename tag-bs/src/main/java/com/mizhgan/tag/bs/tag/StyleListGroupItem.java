/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

/**
 *
 * @author mizhgan
 */
public enum StyleListGroupItem {
    DEFAULT("list-group-item"),
    SUCCESS("list-group-item list-group-item-success"),
    INFO("list-group-item list-group-item-info"),
    WARNING("list-group-item list-group-item-warning"),
    DANGER("list-group-item list-group-item-danger");
    
    private final String style;
    
    StyleListGroupItem(String style) {
        this.style = style;
    }
    
    public String getStyle() {
        return style;
    }
}
