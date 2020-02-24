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
public class Textarea extends Tag {
    
    public Textarea(String name) {
        super("textarea");
        putAttribute("name", name);
        add(new Lit());
    }

    public Textarea(String name, Lit value) {
        super("textarea");
        putAttribute("name", name);
        add(value);
    }

}
