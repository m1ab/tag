/*
 * No fuck license
 */

package com.mizhgan.tag;

/**
 *
 * @author mizhgan
 */
public class Code extends Tag {
    
    public Code() {
        super("code");
    }
    
    public Code(Lit l) {
        this();
        add(l);
    }

    public Code(String s) {
        this();
        add(s);
    }
}
