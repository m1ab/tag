/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizhgan.html.bs.tag;

import com.mizhgan.html.tag.Lit;

/**
 *
 * @author mizhgan, 11.11.2019
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
