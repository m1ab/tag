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
public class BsNav extends BsTag {
    
    public enum View {
        DEFAULT("navbar-default"),
        INVERSE("navbar-inverse");
        private final String name;
        View(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }

    public enum Type {
        FIXED_TOP("navbar-fixed-top"),
        FIXED_BOTTOM("navbar-fixed-bottom"),
        STATIC_TOP("navbar-static-top");
        private final String name;
        Type(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }
    
    public BsNav(View view) {
        this(view, null);
    }
    
    public BsNav(View view, Type type) {
        super("nav", (String.format("navbar %s %s",
                view == null ? "" : view.getName(),
                type == null ? "" : type.getName())).trim());
        putAttribute("role", "navigation");
    }

}
