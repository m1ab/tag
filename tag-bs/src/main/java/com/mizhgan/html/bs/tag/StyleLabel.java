/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizhgan.html.bs.tag;

/**
 *
 * @author mizhgan, 11.11.2019
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
