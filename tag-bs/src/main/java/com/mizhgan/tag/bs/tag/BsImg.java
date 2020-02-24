/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

/**
 *
 * @author mizhgan
 */
public class BsImg extends BsTag {

    public enum Type {
        ROUNDED("img-rounded"),
        CIRCLE("img-circle"),
        THUMBNAIL("img-thumbnail");
        private final String type;
        Type(String type) {
            this.type = type;
        }
        public String getType() {
            return type;
        }
    }

    public BsImg(Type type, boolean responsive, String src, String alt) {
        super("img", type == null ? null : type.getType());
        if (responsive) {
            addClass("img-responsive");
        }
        putAttribute("src", src);
        putAttribute("alt", alt);
    }

    public BsImg(Type type, boolean responsive, String src) {
        this(type, responsive, src, null);
    }
    
    
    
}
