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
public class Td extends Tag {

    public Td() {
        super("td");
        add(new Lit());
    }

    public Td(Lit l) {
        super("td");
        add(l);
    }

    public Td(String s) {
        super("td");
        add(s);
    }
}
