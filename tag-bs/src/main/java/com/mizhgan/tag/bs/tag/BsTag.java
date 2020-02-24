/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

import java.util.Set;

import com.mizhgan.tag.Tag;

/**
 *
 * @author mizhgan
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
