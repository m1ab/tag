/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

import com.mizhgan.tag.Lit;

/**
 *
 * @author mizhgan
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
