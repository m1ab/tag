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
