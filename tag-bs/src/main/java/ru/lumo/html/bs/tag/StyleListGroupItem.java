/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.tag;

/**
 *
 * @author misha
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
