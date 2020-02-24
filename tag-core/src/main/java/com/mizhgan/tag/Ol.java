/*
 * No fuck license
 */

package com.mizhgan.tag;

import java.util.List;

/**
 *
 * @author mizhgan
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
