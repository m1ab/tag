/*
 * No fuck license
 */

package com.mizhgan.tag;

import java.util.List;

/**
 *
 * @author mizhgan
 */
public class Ul extends Tag {
    
    public Ul() {
        super("ul");
    }
    
    public void addAll(List<Li> list) {
        for (Li li : list) {
            add(li);
        }
    }
}
