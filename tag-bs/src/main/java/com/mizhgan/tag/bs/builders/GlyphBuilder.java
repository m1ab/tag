/*
 * No fuck license
 */

package com.mizhgan.tag.bs.builders;

import com.mizhgan.tag.bs.tag.CompSpanGlyphicon;
import com.mizhgan.tag.bs.tag.Glyphicon;
import com.mizhgan.tag.bs.tag.Visibility;

import java.util.List;

/**
 * @author mizhgan
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
