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
public class BsDivContainer extends BsDiv {

    public enum View {
        CONTAINER("container"),
        CONTAINER_FLUID("container-fluid");
        private final String name;
        View(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }
    
    public BsDivContainer(View view) {
        super(view.getName());
    }
    
}
