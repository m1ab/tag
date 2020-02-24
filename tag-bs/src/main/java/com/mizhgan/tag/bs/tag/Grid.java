/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

/**
 *
 * @author mizhgan
 */
public class Grid {
    
    public enum Screen {
        EXTRA_SMALL("xs"),
        SMALL("sm"),
        MEDIUM("md"),
        LARGE("lg");
        private final String name;
        Screen(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }
    
    public enum Size {
        S1(1), 
        S2(2), 
        S3(3), 
        S4(4), 
        S5(5), 
        S6(6), 
        S7(7), 
        S8(8), 
        S9(9), 
        S10(10), 
        S11(11), 
        S12(12);
        private final int size;
        Size(int size) {
            this.size = size;
        }
        public int getSize() {
            return size;
        }
    }
    
    private final Screen screen;
    private final Size size;
    
    public Grid(Screen screen, Size size) {
        this.screen = screen;
        this.size = size;
    }

    @Override
    public String toString() {
        return "col-" + screen.getName() + "-" + size.getSize();
    }
    
    
    
}
