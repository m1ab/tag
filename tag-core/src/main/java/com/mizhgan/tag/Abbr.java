/*
 * No fuck license
 */

package com.mizhgan.tag;

/**
 * Created by misha on 08.03.16.
 */
public class Abbr extends Tag {

    public Abbr(String title, String s) {
        super("abbr");
        putAttribute("title", title);
        add(s);
    }

    public Abbr(String title, Lit l) {
        super("abbr");
        putAttribute("title", title);
        add(l);
    }
}
