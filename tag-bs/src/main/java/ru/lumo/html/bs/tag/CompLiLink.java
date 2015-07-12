/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.tag;

import java.util.List;

/**
 *
 * @author misha
 */
public class CompLiLink extends BsLi {

    public CompLiLink(String name, String link) {
        this(null, name, link);
    }

    public CompLiLink(String tagClass, String name, String link) {
        super(tagClass);
        if (link == null) {
            add(name);
        } else {
            BsA a = new BsA(null, link);
            a.add(name);
            add(a);
        }
    }
}
