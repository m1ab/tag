/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

import com.mizhgan.tag.Lit;

/**
 *
 * @author mizhgan
 */
public class BsDivPanelInclusion extends BsDiv {

    public enum Type {
        panel_heading,
        panel_body,
        panel_footer
    }
    
    public BsDivPanelInclusion(Type type) {
        super(type.name().replace("_", "-"));
        add(new Lit());
    }

    public BsDivPanelInclusion(Type type, Lit l) {
        super(type.name().replace("_", "-"));
        add(l);
    }

    public BsDivPanelInclusion(Type type, String s) {
        super(type.name().replace("_", "-"));
        add(s);
    }
}
