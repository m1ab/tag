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
public class BsButton extends BsTag {

    public enum Type {
        BUTTON("button"),
        SUBMIT("submit");
        private final String name;
        Type(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }
    
    public BsButton(Type type, String tagClass) {
        super("button", tagClass);
        putAttribute("type", type.getName());
    }
    
}
