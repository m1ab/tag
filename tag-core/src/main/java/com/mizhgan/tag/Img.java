/*
 * No fuck license
 */

package com.mizhgan.tag;

/**
 *
 * @author mizhgan
 */
public class Img extends Tag {
    
    public Img(String src, String alt, 
            String width, String height, String style) {
        super("img");
        putAttribute("src", src);
        putAttribute("alt", alt);
        putAttribute("width", width);
        putAttribute("height", height);
        putAttribute("style", style);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
