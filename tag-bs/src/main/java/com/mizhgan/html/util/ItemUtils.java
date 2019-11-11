/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizhgan.html.util;

import com.mizhgan.html.bs.builders.GlyphBuilder;
import com.mizhgan.html.bs.tag.LinkItem;

/**
 *
 * @author mizhgan, 11.11.2019
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
