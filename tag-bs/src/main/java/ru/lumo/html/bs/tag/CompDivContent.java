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
public class CompDivContent extends BsDivContainer {

    BsDivTemplate template;
    
    public CompDivContent() {
        super(BsDivContainer.View.CONTAINER);
        template = new BsDivTemplate();
        template.add("");
        add(template);
    }
    
    public BsDivTemplate getTemplate() {
        return template;
    }
    
}
