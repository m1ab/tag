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
public class P extends Tag {
    
    public P() {
        super("p");
    }
    
    public P(Lit l) {
        this();
        add(l);
    }
    
    public P(String s) {
        this();
        add(s);
    }
}
