/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.tag;

/**
 *
 * @author misha
 */
public class CompDivFooter extends BsDivFooter {
    
    public CompDivFooter(String copyright) {
        BsDivContainer container = 
                new BsDivContainer(BsDivContainer.View.CONTAINER);
        BsP p = new BsP("text-muted");
        p.add(copyright);
        container.add(p);
        add(container);
    }
}
