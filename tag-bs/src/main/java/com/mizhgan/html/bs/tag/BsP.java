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
