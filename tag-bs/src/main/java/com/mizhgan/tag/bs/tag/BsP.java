/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

import com.mizhgan.tag.Lit;

/**
 *
 * @author mizhgan
 */
public class BsP extends BsTag {

    public BsP(String tagClass) {
        super("p", tagClass);
    }

    public BsP(String tagClass, Lit l) {
        this(tagClass);
        add(l);
    }

    public BsP(String tagClass, String s) {
        this(tagClass);
        add(s);
    }
}
