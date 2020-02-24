/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

import com.mizhgan.tag.Lit;

/**
 *
 * @author mizhgan
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
