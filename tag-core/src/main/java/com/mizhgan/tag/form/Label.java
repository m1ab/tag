/*
 * No fuck license
 */

package com.mizhgan.tag.form;

import com.mizhgan.tag.Lit;
import com.mizhgan.tag.Tag;

/**
 *
 * @author mizhgan
 */
public class Label extends Tag {
    
    public Label(Lit l) {
        super("label");
        add(l);
    }
    
    public Label(Lit l, String id) {
        super("label");
        putAttribute("for", id);
        add(l);
    }

}
