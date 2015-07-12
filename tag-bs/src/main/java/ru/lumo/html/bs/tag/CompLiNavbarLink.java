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
public class CompLiNavbarLink extends BsLi {

    public CompLiNavbarLink(String name, String link) {
        this(null, name, link);
    }

    public CompLiNavbarLink(String tagClass, String name, String link) {
        super(tagClass);
        BsA a = new BsA(null, link);
        a.add(name);
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
