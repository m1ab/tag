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
public class BsAListGroupItem extends BsA {


    public BsAListGroupItem(StyleListGroupItem style, String link, String name, String target) {
        super(style.getStyle(), link, target);
        add(new Lit(name));

    }

    public BsAListGroupItem(StyleListGroupItem style, String link, String name) {
        super(style.getStyle(), link);
        add(new Lit(name));
    }

    public BsAListGroupItem(String link, String name) {
        this(StyleListGroupItem.DEFAULT, link, name);
    }

    public BsAListGroupItem(String link, String name, String target) {
        this(StyleListGroupItem.DEFAULT, link, name, target);
    }

    public void setStatus(Status status) {
        addClass(status.name());
    }
}
