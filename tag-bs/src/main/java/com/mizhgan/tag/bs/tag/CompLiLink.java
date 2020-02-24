/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

import com.mizhgan.tag.Lit;

import java.util.List;

/**
 *
 * @author mizhgan
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
