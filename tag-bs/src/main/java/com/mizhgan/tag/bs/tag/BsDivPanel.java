/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

/**
 *
 * @author mizhgan
 */
public class BsDivPanel extends BsDiv {

    public enum View {
        DEFAULT("panel panel-default"),
        PRIMARY("panel panel-primary"),
        SUCCESS("panel panel-success"),
        INFO("panel panel-info"),
        WARNING("panel panel-warning"),
        DANGER("panel panel-danger");
        private final String name;

        View(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public BsDivPanel(View view) {
        super(view.getName());
    }

}
