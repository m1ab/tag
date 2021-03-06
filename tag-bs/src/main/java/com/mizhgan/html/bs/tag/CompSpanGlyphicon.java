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
public class CompSpanGlyphicon extends BsSpan {

    public CompSpanGlyphicon() {
        super("glyphicon");
        add(new Lit());
    }
    
    
    public CompSpanGlyphicon(String glyphName) {
        super("glyphicon " + glyphName);
        add(new Lit());
    }
    
    public CompSpanGlyphicon(Glyphicon glyph) {
        super(glyph.toString());
        add(new Lit());
    }
}
