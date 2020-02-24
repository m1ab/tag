/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

/**
 *
 * @author mizhgan
 */
public class BsA extends BsTag {
    
    public BsA(String tagClass) {
        this(tagClass, null);
    }

    public BsA(String tagClass, String link) {
        super("a", tagClass);
        putAttribute("href", link == null ? "#" : link);
    }

    public BsA(String tagClass, String link, String target) {
        this(tagClass, link);
        if (target != null) putAttribute("target", target);
    }
    
}
