/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

import com.mizhgan.tag.Lit;

/**
 *
 * @author mizhgan
 */
public class BsPLead extends BsP {

    public BsPLead() {
        super("lead");
    }

    public BsPLead(Lit l) {
        this();
        add(l);
    }

    public BsPLead(String s) {
        this();
        add(s);
    }
}
