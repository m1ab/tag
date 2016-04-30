/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.lumo.html.tag.table;

import ru.lumo.html.tag.Lit;
import ru.lumo.html.tag.Tag;

/**
 *
 * @author misha
 */
public class Th extends Tag {

    public Th() {
        super("th");
        add(new Lit());
    }

    public Th(Lit l) {
        super("th");
        add(l);
    }
}
