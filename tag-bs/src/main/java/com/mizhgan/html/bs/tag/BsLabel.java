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
public class BsLabel extends BsTag {

    public final static String CONTROL_LABEL_CLASS="control-label";

    public BsLabel(String tagClass, String id) {
        this(tagClass, id, new Lit());
    }

    public BsLabel(String tagClass, String id, Lit l) {
        super("label", tagClass);
        putAttribute("for", id);
        add(l);
    }

    public BsLabel(String tagClass, String id, String s) {
        super("label", tagClass);
        putAttribute("for", id);
        add(s);
    }
}
