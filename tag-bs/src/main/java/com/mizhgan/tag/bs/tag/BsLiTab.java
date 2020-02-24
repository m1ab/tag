/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

/**
 *
 * @author mizhgan
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