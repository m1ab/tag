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
public class Code extends Tag {
    
    public Code() {
        super("code");
    }
    
    public Code(Lit l) {
        this();
        add(l);
    }
}
