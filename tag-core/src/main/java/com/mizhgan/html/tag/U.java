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
public class U extends Tag {

    public U(Lit l) {
        super("u");
        add(l);
    }

    public U(String s) {
        super("u");
        add(s);
    }
}
