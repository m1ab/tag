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
public class Label extends Tag {
    
    public Label(String text) {
        super("label");
        add(text);
    }
    
    public Label(String text, String id) {
        super("label");
        putAttribute("for", id);
        add(text);
    }

}
