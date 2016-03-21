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
public class Var extends Tag {

    public Var(String s) {
        super("var");
        add(s);
    }

    public Var(Tag tag) {
        super("var");
        add(tag);
    }
}
