/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizhgan.html.bs.tag;

import com.mizhgan.html.tag.H;
import com.mizhgan.html.tag.Lit;

/**
 *
 * @author mizhgan, 11.11.2019
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
