/*
 * No fuck license
 */

package com.mizhgan.tag.util;

import com.mizhgan.tag.bs.builders.GlyphBuilder;
import com.mizhgan.tag.bs.tag.LinkItem;

/**
 *
 * @author mizhgan
 */
public class ItemUtils {

    private GlyphBuilder builder;

    public ItemUtils() {
        builder = new GlyphBuilder();
    }

    public String makeItemName(LinkItem item) {
        if (item.getGlyph()== null) {
            return item.getName();
        }
        String glyph = builder
                .setGlyphiconName(item.getGlyph())
                .setVisibilities(item.getGlyphVisibilities())
                .build()
                .toString();
        return glyph + " " + item.getName();
    }
}
