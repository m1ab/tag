/*
 * No fuck license
 */

package com.mizhgan.tag;

/**
 *
 * @author mizhgan
 */
public class I extends Tag {

    public I(Lit l) {
        super("i");
        add(l);
    }

    public I(String s) {
        super("i");
        add(s);
    }
}
