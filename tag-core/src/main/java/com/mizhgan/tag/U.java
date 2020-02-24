/*
 * No fuck license
 */

package com.mizhgan.tag;

/**
 *
 * @author mizhgan
 */
public class U extends Tag {

    public U(Lit l) {
        super("u");
        add(l);
    }

    public U(String s) {
        super("u");
        add(s);
    }
}
