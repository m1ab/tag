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
public class BsLiTab extends BsLi {

    public enum Type {
        active, dropdown, disabled;
    }

    public BsLiTab() {
        super(null);
        putAttribute("role", "presentation");
    }
    
    public BsLiTab(Type type) {
        super(type.name());
        putAttribute("role", "presentation");
    }
    
}