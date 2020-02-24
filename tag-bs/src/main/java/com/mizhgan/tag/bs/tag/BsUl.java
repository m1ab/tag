/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

/**
 *
 * @author mizhgan
 */
public class BsUl extends BsTag {

    public enum Type {
        UNSTYLED("list-unstyled"),
        INLINE("list-inline");
        private final String type;
        Type(String type) {
            this.type = type;
        }
        public String getType() {
            return type;
        }
    }

    public BsUl(Type type) {
        super("ul", type.getType());
    }
    
    public BsUl(String tagClass) {
        super("ul", tagClass);
    }
    
}
