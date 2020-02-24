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
public class Td extends Tag {

    public Td() {
        super("td");
        add(new Lit());
    }

    public Td(Lit l) {
        super("td");
        add(l);
    }

    public Td(String s) {
        super("td");
        add(s);
    }
}
