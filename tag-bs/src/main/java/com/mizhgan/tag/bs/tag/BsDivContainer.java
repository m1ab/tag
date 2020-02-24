/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

/**
 *
 * @author mizhgan
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
