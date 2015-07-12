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
public class CompSpanGlyphicon extends BsSpan {

    public CompSpanGlyphicon() {
        super("glyphicon");
        add("");
    }
    
    
    public CompSpanGlyphicon(String glyphName) {
        super("glyphicon " + glyphName);
        add("");
    }
    
    public CompSpanGlyphicon(Glyphicon glyph) {
        super(glyph.toString());
        add("");
    }
}
