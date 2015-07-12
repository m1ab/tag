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
public class BsAButton extends BsA {
    
    

    public BsAButton(StyleButton style, String link) {
        super(style.getName(), link);
        putAttribute("role", "button");
    }
    
}
