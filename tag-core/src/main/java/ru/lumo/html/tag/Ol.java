/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.lumo.html.tag;

import java.util.List;

/**
 *
 * @author misha
 */
public class Ol extends Tag {
    
    public Ol() {
        super("ol");
    }
    
    public void addAll(List<Li> list) {
        for (Li li : list) {
            add(li);
        }
    }
}
