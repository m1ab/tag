/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

/**
 *
 * @author mizhgan
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
