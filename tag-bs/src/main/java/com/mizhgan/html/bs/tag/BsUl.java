/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizhgan.html.bs.tag;

/**
 *
 * @author mizhgan, 11.11.2019
 */
public class BsUl extends BsTag {

    public enum Type {
        UNSTYLED("list-unstyled"),
        INLINE("list-inline");
        private final String type;
        Type(String type) {
            this.type = type;
        }
        public String getType() {
            return type;
        }
    }

    public BsUl(Type type) {
        super("ul", type.getType());
    }
    
    public BsUl(String tagClass) {
        super("ul", tagClass);
    }
    
}
