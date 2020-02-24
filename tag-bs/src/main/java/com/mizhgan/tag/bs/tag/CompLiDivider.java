/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

import com.mizhgan.tag.Lit;

/**
 *
 * @author mizhgan
 */
public class CompLiDivider extends BsLi {

    public CompLiDivider() {
        this(false);
    }

    public CompLiDivider(boolean role) {
        super("divider");
        if(role) putAttribute("role", "separator");
        add(new Lit());
    }
    
}
