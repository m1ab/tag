/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.builders;

import java.util.List;
import ru.lumo.html.bs.tag.CompSpanGlyphicon;
import ru.lumo.html.bs.tag.Glyphicon;
import ru.lumo.html.bs.tag.Visibility;

/**
 *
 * @author misha
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
