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
public class Tbody extends Tag {

    public Tbody() {
        super("tbody");
        add(new Lit());
    }
}
