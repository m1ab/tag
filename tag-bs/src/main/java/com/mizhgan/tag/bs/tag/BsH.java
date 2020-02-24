/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

import com.mizhgan.tag.Lit;
import com.mizhgan.tag.H;

/**
 *
 * @author mizhgan
 */
public class BsH extends BsTag {
    
    public BsH(H.Size size, String tagClass) {
        super(size.name(), tagClass);
    }
    
    public BsH(H.Size size, String tagClass, Lit l) {
        super(size.name(), tagClass);
        add(l);
    }

    public BsH(H.Size size, String tagClass, String s) {
        super(size.name(), tagClass);
        add(s);
    }
}
