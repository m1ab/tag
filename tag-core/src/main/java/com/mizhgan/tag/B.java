/*
 * No fuck license
 */

package com.mizhgan.tag;

/**
 *
 * @author mizhgan
 */
public class B extends Tag {

    public B(Lit l) {
        super("b");
        add(l);
    }

    public B(String s) {
        super("b");
        add(s);
    }
}
