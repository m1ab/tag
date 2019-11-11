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
public class Em extends Tag {
    
    public Em() {
        super("em");
    }

    public Em(Lit l) {
        super("em");
        add(l);
    }

    public Em(String s) {
        super("em");
        add(s);
    }
}
