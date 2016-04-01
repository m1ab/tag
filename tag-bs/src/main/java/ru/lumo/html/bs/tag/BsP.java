/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.tag;

import ru.lumo.html.tag.Tag;

/**
 *
 * @author misha
 */
public class BsP extends BsTag {

    public BsP(String tagClass) {
        super("p", tagClass);
    }

    public BsP(String tagClass, String s) {
        super("p", tagClass);
        add(s);
    }

    public BsP(String tagClass, Tag tag) {
        super("p", tagClass);
        add(tag);
    }
}
