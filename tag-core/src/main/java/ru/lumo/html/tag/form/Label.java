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
