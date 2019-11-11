/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizhgan.html.bs.builders;

import com.mizhgan.html.bs.tag.CompSpanGlyphicon;
import com.mizhgan.html.bs.tag.Glyphicon;
import com.mizhgan.html.bs.tag.Visibility;

import java.util.List;

/**
 *
 * @author mizhgan, 11.11.2019
 */
public class GlyphBuilder {

    private String glyphiconName;
    private Glyphicon glyphicon;
    private List<Visibility> visibilities;

    public GlyphBuilder setGlyphiconName(String glyphiconName) {
        this.glyphiconName = glyphiconName;
        return this;
    }
    
    public GlyphBuilder setGlyphicon(Glyphicon glyphicon) {
        this.glyphicon = glyphicon;
        return this;
    }
    
    public GlyphBuilder setVisibilities(List<Visibility> visibilities) {
        this.visibilities = visibilities;
        return this;
    }
    
    public CompSpanGlyphicon build() {
        CompSpanGlyphicon comp = glyphicon != null 
                ? new CompSpanGlyphicon(glyphicon)
                : glyphiconName != null 
                        ? new CompSpanGlyphicon(glyphiconName) 
                        : new CompSpanGlyphicon();
        if (visibilities != null && !visibilities.isEmpty()) {
            for (Visibility visibility : visibilities) {
                comp.addClass(visibility.toString());
            }
        }
        return comp;
    }
}
