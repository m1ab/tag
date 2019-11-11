/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizhgan.html.bs.tag;

import java.util.Set;
import com.mizhgan.html.tag.Tag;

/**
 *
 * @author mizhgan, 11.11.2019
 */
public class BsTag extends Tag {
    
    public static final String CLASS = "class";

    public BsTag(String name, String tagClass) {
        super(name);
        if (tagClass != null) putAttribute(CLASS, tagClass);
    }
    
    public BsTag(String name, Set<String> tagClasses) {
        super(name);
        StringBuilder sb = new StringBuilder();
        if (tagClasses != null && !tagClasses.isEmpty()) {
            for (String s : tagClasses) {
                if (s != null) sb.append(s).append(" ");
            }
            putAttribute(CLASS, sb.toString().trim());
        }
    }
    
    public void addClass(String tagClass) {
        if (attributes.keySet().contains(CLASS)) {
            String s = attributes.get(CLASS);
            if (!s.toLowerCase().matches(tagClass.toLowerCase())) {
                putAttribute(CLASS, s + " " + tagClass);
            }
        } else {
            putAttribute(CLASS, tagClass);
        }
    }
    
}
