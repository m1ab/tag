/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

/**
 *
 * @author mizhgan
 */
public class BsInputButton extends BsTag {

    public enum Type {
        BUTTON, SUBMIT;
        public String toString() {
            return name().toLowerCase();
        }
    }

    public BsInputButton(Type type, String tagClass) {
        super("input", tagClass);
        putAttribute("type", type.toString());
    }
    
}
