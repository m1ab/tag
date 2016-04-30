/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.tag;

import ru.lumo.html.tag.Lit;

/**
 *
 * @author misha
 */
public class BsPLead extends BsP {

    public BsPLead() {
        super("lead");
    }

    public BsPLead(Lit l) {
        this();
        add(l);
    }
}
