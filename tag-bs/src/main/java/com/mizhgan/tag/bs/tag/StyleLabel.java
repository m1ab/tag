/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

/**
 *
 * @author mizhgan
 */
public enum StyleLabel {
    
    DEFAULT("label label-default"),
    PRIMARY("label label-primary"),
    SUCCESS("label label-success"),
    INFO("label label-info"),
    WARNING("label label-warning"),
    DANGER("label label-danger");
    
    private final String name;
    
    StyleLabel(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
