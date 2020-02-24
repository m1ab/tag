/*
 * No fuck license
 */

package com.mizhgan.tag;

/**
 *
 * @author mizhgan
 */
public class Em extends Tag {
    
    public Em() {
        super("em");
    }

    public Em(Lit l) {
        super("em");
        add(l);
    }

    public Em(String s) {
        super("em");
        add(s);
    }
}
