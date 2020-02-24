/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

/**
 *
 * @author mizhgan
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