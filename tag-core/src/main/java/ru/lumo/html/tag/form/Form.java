/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.lumo.html.tag.form;

import ru.lumo.html.tag.Tag;
import ru.lumo.html.tag.form.Verb;

/**
 *
 * @author misha
 */
public class Form extends Tag {
    
    public Form(String action, Verb method) {
        super("form");
        putAttribute("action", action);
        putAttribute("method", method.name());
    }
}
