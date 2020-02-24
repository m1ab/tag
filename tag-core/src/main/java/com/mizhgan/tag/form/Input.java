/*
 * No fuck license
 */

package com.mizhgan.tag.form;

import com.mizhgan.tag.Tag;

/**
 *
 * @author mizhgan
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
