/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

/**
 *
 * @author mizhgan
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
