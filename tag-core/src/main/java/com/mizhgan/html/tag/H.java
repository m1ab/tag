/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mizhgan.html.tag;

/**
 *
 * @author mizhgan, 11.11.2019
 */
public class H extends Tag {
    
    public enum Size {
        h1,
        h2,
        h3,
        h4,
        h5,
        h6
    }
    
    public H(Size size) {
        super(size.name());
    }
    
    public H(Size size, Lit l) {
        this(size);
        add(l);
    }

    public H(Size size, String s) {
        this(size);
        add(s);
    }
}
