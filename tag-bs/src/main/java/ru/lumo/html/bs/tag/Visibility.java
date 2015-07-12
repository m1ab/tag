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
public enum Visibility {
    visible_lg,
    visible_md,
    visible_sm,
    visible_xs,
    hidden_lg,
    hidden_md,
    hidden_sm,
    hidden_xs;
    
    @Override
    public String toString() {
        return name().replace("_", "-");
    }
}
