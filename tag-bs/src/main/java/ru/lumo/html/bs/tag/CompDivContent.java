/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.tag;

import ru.lumo.html.tag.Lit;

/**
 *
 * @author misha
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
