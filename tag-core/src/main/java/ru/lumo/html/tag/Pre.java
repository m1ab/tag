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
public class Pre extends Tag {

    public Pre() {
        super("pre");
    }

    public Pre(Lit l) {
        this();
        add(l);
    }

    public Pre(String s) {
        this();
        add(s);
    }
}
