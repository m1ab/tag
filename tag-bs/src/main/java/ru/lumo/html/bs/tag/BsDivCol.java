/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.tag;

import java.util.List;

/**
 *
 * @author misha
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
