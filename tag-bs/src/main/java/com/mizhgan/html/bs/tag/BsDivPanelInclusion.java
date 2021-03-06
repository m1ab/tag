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
