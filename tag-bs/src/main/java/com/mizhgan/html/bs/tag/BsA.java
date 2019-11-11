/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizhgan.html.bs.tag;

/**
 *
 * @author mizhgan, 11.11.2019
 */
public class BsA extends BsTag {
    
    public BsA(String tagClass) {
        this(tagClass, null);
    }

    public BsA(String tagClass, String link) {
        super("a", tagClass);
        putAttribute("href", link == null ? "#" : link);
    }

    public BsA(String tagClass, String link, String target) {
        this(tagClass, link);
        if (target != null) putAttribute("target", target);
    }
    
}
