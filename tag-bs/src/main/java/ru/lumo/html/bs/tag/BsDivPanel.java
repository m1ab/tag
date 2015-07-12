/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.tag;

/**
 *
 * @author misha
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
