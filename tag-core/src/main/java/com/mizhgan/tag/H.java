/*
 * No fuck license
 */

package com.mizhgan.tag;

/**
 *
 * @author mizhgan
 */
public class H extends Tag {
    
    public enum Size {
        h1,
        h2,
        h3,
        h4,
        h5,
        h6
    }
    
    public H(Size size) {
        super(size.name());
    }
    
    public H(Size size, Lit l) {
        this(size);
        add(l);
    }

    public H(Size size, String s) {
        this(size);
        add(s);
    }
}
