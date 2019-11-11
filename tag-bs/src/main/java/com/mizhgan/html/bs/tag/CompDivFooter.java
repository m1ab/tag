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
