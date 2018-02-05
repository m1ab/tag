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
public class I extends Tag {

    public I(Lit l) {
        super("i");
        add(l);
    }

    public I(String s) {
        super("i");
        add(s);
    }
}
