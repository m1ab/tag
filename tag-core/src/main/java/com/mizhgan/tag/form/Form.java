/*
 * No fuck license
 */

package com.mizhgan.tag.form;

import com.mizhgan.tag.Tag;

/**
 *
 * @author mizhgan
 */
public class Form extends Tag {
    
    public Form(String action, Verb method) {
        super("form");
        putAttribute("action", action);
        putAttribute("method", method.name());
    }
}
