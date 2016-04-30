/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.lumo.html.tag.form;

import ru.lumo.html.tag.Lit;
import ru.lumo.html.tag.Tag;

/**
 *
 * @author misha
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
