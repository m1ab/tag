/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

/**
 *
 * @author mizhgan
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
