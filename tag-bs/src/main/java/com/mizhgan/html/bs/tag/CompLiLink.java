/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizhgan.html.bs.tag;

import com.mizhgan.html.tag.Lit;

/**
 *
 * @author mizhgan, 11.11.2019
 */
public class CompLiLink extends BsLi {

    public CompLiLink(String name, String link) {
        this(null, name, link);
    }

    public CompLiLink(String tagClass, String name, String link) {
        super(tagClass);
        if (link == null) {
            add(new Lit(name));
        } else {
            BsA a = new BsA(null, link);
            a.add(new Lit(name));
            add(a);
        }
    }
}
