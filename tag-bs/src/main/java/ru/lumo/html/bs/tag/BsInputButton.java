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
public class BsInputButton extends BsTag {

    public enum Type {
        BUTTON, SUBMIT;
        public String toString() {
            return name().toLowerCase();
        }
    }

    public BsInputButton(Type type, String tagClass) {
        super("input", tagClass);
        putAttribute("type", type.toString());
    }
    
}
