/*
 * No fuck license
 */

package com.mizhgan.tag;

/**
 *
 * @author mizhgan
 */
public class Kbd extends Tag {

    public Kbd(Lit l) {
        super("kbd");
        add(l);
    }

    public Kbd(String s) {
        super("kbd");
        add(s);
    }
}
