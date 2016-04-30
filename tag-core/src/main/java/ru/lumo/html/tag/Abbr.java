package ru.lumo.html.tag;

/**
 * Created by misha on 08.03.16.
 */
public class Abbr extends Tag {

    public Abbr(String title, Lit l) {
        super("abbr");
        putAttribute("title", title);
        add(l);
    }
}
