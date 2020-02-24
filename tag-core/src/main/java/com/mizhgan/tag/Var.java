/*
 * No fuck license
 */

package com.mizhgan.tag;

/**
 *
 * @author mizhgan
 */
public class Var extends Tag {

    public Var(Lit l) {
        super("var");
        add(l);
    }

    public Var(String s) {
        super("var");
        add(s);
    }
}
