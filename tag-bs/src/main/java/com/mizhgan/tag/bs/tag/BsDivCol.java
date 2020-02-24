/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

import java.util.List;

/**
 *
 * @author mizhgan
 */
public class BsDivCol extends BsDiv {
    
    public BsDivCol(List<Grid> grids) {
        this(null, grids);
    }
    
    public BsDivCol(String tagClass, List<Grid> grids) {
        super(tagClass);
        if (grids != null) {
            for (Grid grid : grids) {
                addClass(grid.toString());
            }
        }
    }
    
}
