package ru.lumo.html.tag;

/**
 * Created by misha on 08.03.16.
 */
public class Abbr extends Tag {

    public Abbr(String title, String text) {
        super("abbr");
        putAttribute("title", title);
        add(text);
    }
}
