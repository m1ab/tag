/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.util;

import ru.lumo.html.bs.builders.GlyphBuilder;
import ru.lumo.html.bs.tag.LinkItem;

import javax.inject.Inject;

/**
 *
 * @author misha
 */
public class ItemUtils {

    @Inject
    private GlyphBuilder builder;

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
