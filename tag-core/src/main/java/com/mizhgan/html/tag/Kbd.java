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
public class Kbd extends Tag {

    public Kbd(Lit l) {
        super("kbd");
        add(l);
    }

    public Kbd(String s) {
        super("kbd");
        add(s);
    }
}
