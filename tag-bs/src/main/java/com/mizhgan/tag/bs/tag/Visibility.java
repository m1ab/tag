/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

/**
 *
 * @author mizhgan
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
