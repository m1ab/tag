/*
 * No fuck license
 */

package com.mizhgan.tag;

/**
 *
 * @author mizhgan
 */
public class Small extends Tag {
    
    public Small() {
        super("small");
    }
    
    public Small(Lit l) {
        this();
        add(l);
    }

    public Small(String s) {
        this();
        add(s);
    }
}
