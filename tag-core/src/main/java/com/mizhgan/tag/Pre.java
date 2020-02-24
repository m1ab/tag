/*
 * No fuck license
 */

package com.mizhgan.tag;

/**
 *
 * @author mizhgan
 */
public class Pre extends Tag {

    public Pre() {
        super("pre");
    }

    public Pre(Lit l) {
        this();
        add(l);
    }

    public Pre(String s) {
        this();
        add(s);
    }
}
