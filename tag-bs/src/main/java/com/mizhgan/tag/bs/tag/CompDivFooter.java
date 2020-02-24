/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

import com.mizhgan.tag.Lit;

/**
 *
 * @author mizhgan
 */
public class CompDivFooter extends BsDivFooter {
    
    public CompDivFooter(Lit copyright) {
        BsDivContainer container = 
                new BsDivContainer(BsDivContainer.View.container);
        BsP p = new BsP("text-muted");
        p.add(copyright);
        container.add(p);
        add(container);
    }
}
