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
public class BsLiTab extends BsLi {

    public enum Type {
        ACTIVE("active"),
        DROPDOWN("dropdown"),
        DISABLED("disabled");
        private final String name;
        Type(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }

    public BsLiTab() {
        super(null);
        putAttribute("role", "presentation");
    }
    
    public BsLiTab(Type type) {
        super(type.getName());
        putAttribute("role", "presentation");
    }
    
}