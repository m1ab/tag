/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizhgan.html.bs.tag;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mizhgan, 11.11.2019
 */
public class LinkItem {
    
    private String name;
    private String link;
    private boolean active = false;
    private boolean disabled = false;
    private List<Visibility> visibilities = new ArrayList<>();
    private final List<LinkItem> childs = new ArrayList<>();
    private boolean alignRight = false;
    private Date date;
    private String glyph;
    private List<Visibility> glyphVisibilities = new ArrayList<>();
    
    public LinkItem() {
    }
    
    public LinkItem(String name) {
        this.name = name;
    }
    
    public LinkItem(String name, String link) {
        this.name = name;
        this.link = link;
    }

    public LinkItem(String name, String link, Date date) {
        this.name = name;
        this.link = link;
        this.date = date;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public List<Visibility> getVisibilities() {
        return visibilities;
    }

    public void setVisibilities(List<Visibility> visibilities) {
        this.visibilities = visibilities;
    }
    
    public void addChild(LinkItem item) {
        childs.add(item);
    }
    
    public void addChilds(List<LinkItem> childs) {
        this.childs.addAll(childs);
    }

    public List<LinkItem> getChilds() {
        return childs;
    }
    
    public boolean hasChilds() {
        return !childs.isEmpty();
    }

    public boolean isAlignRight() {
        return alignRight;
    }

    public void setAlignRight(boolean alignRight) {
        this.alignRight = alignRight;
    }

    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }

    public String getGlyph() {
        return glyph;
    }

    public void setGlyph(String glyph) {
        this.glyph = glyph;
    }

    public List<Visibility> getGlyphVisibilities() {
        return glyphVisibilities;
    }

    public void setGlyphVisibilities(List<Visibility> glyphVisibilities) {
        this.glyphVisibilities = glyphVisibilities;
    }

}
