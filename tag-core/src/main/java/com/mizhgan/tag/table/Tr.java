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
public class Tr extends Tag {

    public Tr() {
        super("tr");
        add(new Lit());
    }
}
