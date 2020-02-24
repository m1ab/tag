/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

import com.mizhgan.tag.Lit;

import static com.mizhgan.tag.H.Size;


/**
 *
 * @author mizhgan
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
            heading = new BsDivPanelInclusion(BsDivPanelInclusion.Type.panel_heading);
            add(heading);
        } else {
            heading = null;
        }
        body = new BsDivPanelInclusion(BsDivPanelInclusion.Type.panel_body);
        add(body);
        if (f) {
            footer = new BsDivPanelInclusion(BsDivPanelInclusion.Type.panel_footer);
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
