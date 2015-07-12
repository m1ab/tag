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
public class P extends Tag {
    
    public P() {
        super("p");
    }
    
    public P(String s) {
        this();
        add(s);
    }
    
    public P(Tag t) {
        this();
        add(t);
    }
}
