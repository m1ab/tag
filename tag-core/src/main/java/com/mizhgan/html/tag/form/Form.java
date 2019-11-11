/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mizhgan.html.tag.form;

import com.mizhgan.html.tag.Tag;

/**
 *
 * @author mizhgan, 11.11.2019
 */
public class Form extends Tag {
    
    public Form(String action, Verb method) {
        super("form");
        putAttribute("action", action);
        putAttribute("method", method.name());
    }
}
