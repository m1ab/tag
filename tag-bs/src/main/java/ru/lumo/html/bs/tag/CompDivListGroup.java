/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.tag;

/**
 *
 * @author misha
 */
public class CompDivListGroup extends BsDivListGroup {

    public CompDivListGroup() {
        super();
    }

    public void addItem(String link, String name) {
        addItem(null, link, name);
    }

    public void addTargetedItem(String link, String name, String target) {
        addTargetedItem(null, link, name, target);
    }

    public void addItem(StyleListGroupItem style, String link, String name) {
        BsAListGroupItem a = style == null
                ? new BsAListGroupItem(link, name)
                : new BsAListGroupItem(style, link, name);
        add(a);
    }

    public void addTargetedItem(StyleListGroupItem style, String link, String name, String target) {
        BsAListGroupItem a = style == null
                ? new BsAListGroupItem(link, name, target)
                : new BsAListGroupItem(style, link, name, target);
        add(a);
    }

    public void addItem(LinkItem item) {
        addItem(item, null);
    }

    public void addItem(LinkItem item, StyleListGroupItem style) {
        BsAListGroupItem a = style == null
                ? new BsAListGroupItem(item.getLink(), item.getName())
                : new BsAListGroupItem(style, item.getLink(), item.getName());
        if (item.isActive()) {
            a.setStatus(Status.active);
        } else if (item.isDisabled()) {
            a.setStatus(Status.disabled);
        }
        add(a);
    }
}
