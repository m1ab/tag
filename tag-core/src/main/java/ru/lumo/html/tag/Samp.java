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
public class Samp extends Tag {

    public Samp(String s) {
        super("samp");
        add(s);
    }

    public Samp(Tag tag) {
        super("samp");
        add(tag);
    }
}
