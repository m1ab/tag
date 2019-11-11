/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizhgan.html.bs.tag;

import com.mizhgan.html.tag.Lit;

import static com.mizhgan.html.tag.H.Size;
import static com.mizhgan.html.bs.tag.BsDivPanelInclusion.Type;


/**
 *
 * @author mizhgan, 11.11.2019
 */
public class CompDivPanel extends BsDivPanel {

    final BsDivPanelInclusion heading;
    final BsDivPanelInclusion body;
    final BsDivPanelInclusion footer;
    
    public CompDivPanel(View view) {
        this(view, false, false);
    }
    
    public CompDivPanel(View view, boolean h, boolean f) {
        super(view);
        if (h) {
            heading = new BsDivPanelInclusion(Type.panel_heading);
            add(heading);
        } else {
            heading = null;
        }
        body = new BsDivPanelInclusion(Type.panel_body);
        add(body);
        if (f) {
            footer = new BsDivPanelInclusion(Type.panel_footer);
            add(footer);
        } else {
            footer = null;
        }
    }

    public BsDivPanelInclusion getHeading() {
        return heading;
    }

    public BsDivPanelInclusion getBody() {
        return body;
    }

    public BsDivPanelInclusion getFooter() {
        return footer;
    }

    public BsH getBsH() {
        return heading == null ? null : new BsH(Size.h3, "panel-title", new Lit());
    }
}
