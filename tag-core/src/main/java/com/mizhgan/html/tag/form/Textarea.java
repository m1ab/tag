/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mizhgan.html.tag.form;

import com.mizhgan.html.tag.Lit;
import com.mizhgan.html.tag.Tag;

/**
 *
 * @author mizhgan, 11.11.2019
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
