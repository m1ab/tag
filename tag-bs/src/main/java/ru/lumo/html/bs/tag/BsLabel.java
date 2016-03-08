/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.tag;

/**
 *
 * @author misha
 */
public class BsLabel extends BsTag {

    public BsLabel(String id, String text) {
        this("control-label", id, text);
    }

    public BsLabel(String tagClass, String id, String text) {
        super("label", tagClass);
        putAttribute("for", id);
        add(text);
    }

}