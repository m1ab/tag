package ru.lumo.html.bs.tag;

import ru.lumo.html.tag.table.Tbody;
import ru.lumo.html.tag.table.Thead;

/**
 * Created by misha on 03.03.16.
 */
public class BsTable extends BsTag {

    private Thead thead;
    private Tbody tbody;

    public enum Type {
        TABLE("table"),
        TABLE_STRIPPED("table table-striped"),
        TABLE_BORDERED("table table-bordered"),
        TABLE_HOVER("table table-hover"),
        TABLE_CONDENCED("table table-condensed");
        private final String name;
        Type(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }

    public BsTable(Type type) {
        super("table", type.getName());
        thead = new Thead();
        tbody = new Tbody();
        add(thead);
        add(tbody);
    }

    public Thead getThead() {
        return thead;
    }

    public Tbody getTbody() {
        return tbody;
    }
}
