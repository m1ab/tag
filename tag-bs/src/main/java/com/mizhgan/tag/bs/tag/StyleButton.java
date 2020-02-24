/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

/**
 *
 * @author mizhgan
 */
public enum StyleButton {
    
    DEFAULT("btn btn-default"),
    PRIMARY("btn btn-primary"),
    SUCCESS("btn btn-success"),
    INFO("btn btn-info"),
    WARNING("btn btn-warning"),
    DANGER("btn btn-danger"),
    LINK("btn btn-link");
    
    private final String name;
    
    StyleButton(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
