/*
 * To change this license header, choose License Headers in TEXTroject TEXTroperties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.lumo.html.bs.tag;

/**
 *
 * @author misha
 */
public enum TextStyle {
    text_muted,
    text_primary,
    text_success,
    text_info,
    text_warning,
    text_danger;
    
    @Override
    public String toString() {
        return name().replace("_", "-");
    }
}