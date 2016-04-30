package ru.lumo.html.bs.tag;

import ru.lumo.html.tag.Lit;

/**
 * Created by misha on 08.03.16.
 */
public class CompSpanCaret extends BsSpan {

    public CompSpanCaret() {
        super("caret");
        add(new Lit());
    }
}
