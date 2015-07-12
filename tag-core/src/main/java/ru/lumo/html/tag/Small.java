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
public class Small extends Tag {
    
    public Small() {
        super("small");
    }
    
    public Small(String s) {
        this();
        add(s);
    }
    
    public Small(Tag t) {
        this();
        add(t);
    }
}
