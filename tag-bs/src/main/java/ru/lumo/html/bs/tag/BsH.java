/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.tag;

import ru.lumo.html.tag.H;
import ru.lumo.html.tag.Lit;

/**
 *
 * @author misha
 */
public class BsH extends BsTag {
    
    public BsH(H.Size size, String tagClass) {
        super(size.name(), tagClass);
    }
    
    public BsH(H.Size size, String tagClass, Lit l) {
        super(size.name(), tagClass);
        add(l);
    }
}
