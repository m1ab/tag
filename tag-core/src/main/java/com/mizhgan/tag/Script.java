/*
 * No fuck license
 */

package com.mizhgan.tag;

/**
 *
 * @author mizhgan
 */
public class Script extends Tag {

    public Script(String src) {
        super("script");
        putAttribute("src", src);
    }
    
}
