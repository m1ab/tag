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
public class Input extends Tag {
    
    public Input(InputType type) {
        super("input");
        putAttribute("type", type.name());
    }
    
    public Input(InputType type, String id, String name, String value) {
        super("input");
        putAttribute("type", type.name());
        if (id != null) putAttribute("id", id);
        if (name != null) putAttribute("name", name);
        if (value != null) putAttribute("value", value);
    }
}
