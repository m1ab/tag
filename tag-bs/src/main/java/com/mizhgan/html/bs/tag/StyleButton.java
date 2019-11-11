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
