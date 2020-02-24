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
public class CompLiNavbarLink extends BsLi {

    public CompLiNavbarLink(String name, String link) {
        this(null, name, link);
    }

    public CompLiNavbarLink(String tagClass, String name, String link) {
        super(tagClass);
        BsA a = new BsA(null, link);
        a.add(new Lit(name));
        add(a);
    }

    public void setVisibilities(List<Visibility> visibilities) {
        if (visibilities != null && !visibilities.isEmpty()) {
            for (Visibility visibility : visibilities) {
                addClass(visibility.toString());
            }
        }
    }
    
}
