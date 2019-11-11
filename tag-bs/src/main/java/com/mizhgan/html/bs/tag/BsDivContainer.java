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
public class BsDivContainer extends BsDiv {

    public enum View {
        container, container_fluid;
        @Override
        public String toString() {
            return name().replace("_", "-");
        }
    }
    
    public BsDivContainer(View view) {
        super(view.toString());
    }
    
}
