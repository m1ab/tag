/*
 * No fuck license
 */

package com.mizhgan.tag;

/**
 *
 * @author mizhgan
 */
public class Samp extends Tag {

    public Samp(Lit l) {
        super("samp");
        add(l);
    }

    public Samp(String s) {
        super("samp");
        add(s);
    }
}
