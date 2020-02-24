/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

/**
 *
 * @author mizhgan
 */
public class BsAButton extends BsA {
    
    

    public BsAButton(StyleButton style, String link) {
        super(style.getName(), link);
        putAttribute("role", "button");
    }
    
}
