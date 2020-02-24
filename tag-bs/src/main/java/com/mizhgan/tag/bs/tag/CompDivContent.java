/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

import com.mizhgan.tag.Lit;

/**
 *
 * @author mizhgan
 */
public class CompDivContent extends BsDivContainer {

    BsDivTemplate template;
    
    public CompDivContent() {
        super(View.container);
        template = new BsDivTemplate();
        template.add(new Lit());
        add(template);
    }
    
    public BsDivTemplate getTemplate() {
        return template;
    }
    
}
