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
public class BsA extends BsTag {

//    public BsA() {
//        this(null, null);
//    }
    
    public BsA(String tagClass) {
        this(tagClass, null);
    }

    public BsA(String tagClass, String link) {
        super("a", tagClass);
        putAttribute("href", link == null ? "#" : link);
    }
    
}
