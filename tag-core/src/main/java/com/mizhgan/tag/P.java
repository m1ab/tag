/*
 * No fuck license
 */

package com.mizhgan.tag;

/**
 *
 * @author mizhgan
 */
public class P extends Tag {
    
    public P() {
        super("p");
    }
    
    public P(Lit l) {
        this();
        add(l);
    }
    
    public P(String s) {
        this();
        add(s);
    }
}
