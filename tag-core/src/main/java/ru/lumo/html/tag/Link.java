/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.lumo.html.tag;

/**
 *
 * @author misha
 */
public class Link extends Tag {
    
    public static final String REL_SHORTCUT_ICON = "shortcut icon";
    public static final String REL_STYLESHEET = "stylesheet";
    
    public Link(String rel, String href) {
        super("link");
        putAttribute("rel", rel);
        putAttribute("href", href);
    }
    
    public Link(String media, String rel, String href, String type) {
        super("link");
        putAttribute("media", media);
        putAttribute("rel", rel);
        putAttribute("href", href);
        putAttribute("type", type);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
