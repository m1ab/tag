/*
 * No fuck license
 */

package com.mizhgan.tag.table;

import com.mizhgan.tag.Tag;

/**
 * Created by misha on 07.03.16.
 */
public class Table extends Tag {

    private Thead thead;
    private Tbody tbody;

    public Table() {
        super("table");
        thead = new Thead();
        tbody = new Tbody();
        add(thead);
        add(tbody);
    }

    public Thead getThead() {
        return thead;
    }

    public Tbody getTbody() {
        return tbody;
    }
}