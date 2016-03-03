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
public class Th extends Tag {

    public Th() {
        super("th");
        add("");
    }

    public Th(String s) {
        super("th");
        add(s);
    }
}
