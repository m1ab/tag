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
public class BsDivButtonGroup extends BsDiv {

    public BsDivButtonGroup() {
        super("btn-group");
        putAttribute("role", "group");
    }

    public BsDivButtonGroup(String ariaLabel) {
        this();
        putAttribute("aria-label", ariaLabel);
    }
    
}
