/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mizhgan.html.tag;

import java.util.List;

/**
 *
 * @author mizhgan, 11.11.2019
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
