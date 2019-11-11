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
public class BsUlNav extends BsUl {

    public enum Type {
        TABS("nav nav-tabs"),
        PILLS("nav nav-pills"),
        PILLS_STACKED("nav nav-pills nav-stacked"),
        TABS_JUSTIFIED("nav nav-tabs nav-justified"),
        PILLS_JUSTIFIED("nav nav-pills nav-justified");
        private final String name;
        Type(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }

    public BsUlNav(Type type) {
        super(type.getName());
        putAttribute("role", "tablist");
    }
    
}
