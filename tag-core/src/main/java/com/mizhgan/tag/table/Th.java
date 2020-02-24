/*
 * No fuck license
 */

package com.mizhgan.tag.table;

import com.mizhgan.tag.Lit;
import com.mizhgan.tag.Tag;

/**
 *
 * @author mizhgan
 */
public class Th extends Tag {

    public Th() {
        super("th");
        add(new Lit());
    }

    public Th(Lit l) {
        super("th");
        add(l);
    }

    public Th(String s) {
        super("th");
        add(s);
    }
}
