/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mizhgan.html.tag.table;

import com.mizhgan.html.tag.Lit;
import com.mizhgan.html.tag.Tag;

/**
 *
 * @author mizhgan, 11.11.2019
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
