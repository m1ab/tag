/*
 * No fuck license
 */

package com.mizhgan.tag;

/**
 *
 * @author mizhgan
 */
public class Html extends Tag {
    
    public Html(String lang) {
        super("html");
        putAttribute("lang", lang);
    }
}
