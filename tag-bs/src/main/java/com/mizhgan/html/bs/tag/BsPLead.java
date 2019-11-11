/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizhgan.html.bs.tag;

import com.mizhgan.html.tag.Lit;

/**
 *
 * @author mizhgan, 11.11.2019
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
