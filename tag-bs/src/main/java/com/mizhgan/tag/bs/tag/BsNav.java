/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

/**
 *
 * @author mizhgan
 */
public class BsNav extends BsTag {
    
    public enum View {
        navbar_default, navbar_inverse;
        @Override
        public String toString() {
            return name().replace("_", "-");
        }
    }

    public enum Type {
        navbar_fixed_top, navbar_fixed_bottom, navbar_static_top;
        @Override
        public String toString() {
            return name().replace("_", "-");
        }
    }
    
    public BsNav(View view) {
        this(view, null);
    }
    
    public BsNav(View view, Type type) {
        super("nav", String.format("navbar %s %s",
                view == null ? "" : view.toString(),
                type == null ? "" : type.toString()).trim());
        putAttribute("role", "navigation");
    }

}
