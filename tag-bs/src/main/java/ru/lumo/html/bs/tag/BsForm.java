package ru.lumo.html.bs.tag;

import ru.lumo.html.tag.form.Verb;

/**
 * Created by misha on 07.03.16.
 */
public class BsForm extends BsTag {

    public enum Type {
        FORM_INLINE,
        FORM_HORIZONTAL
    }

    public BsForm(String action, Verb method) {
        this(null, action, method);
    }

    public BsForm(Type type, String action, Verb method) {
        super("form", type == null ? null : type.name().replace("_", "-").toLowerCase());
        putAttribute("action", action);
        putAttribute("method", method.name());
    }

}
