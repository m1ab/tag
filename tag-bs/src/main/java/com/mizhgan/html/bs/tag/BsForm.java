package com.mizhgan.html.bs.tag;

import com.mizhgan.html.tag.form.Verb;

/**
 * Created by misha on 07.03.16.
 */
public class BsForm extends BsTag {

    public enum Type {
        FORM_INLINE,
        FORM_HORIZONTAL
    }

    public enum Orientation {
        RIGHT,
        LEFT
    }

    public BsForm(String action, Verb method, Orientation orientation) {
        super("form", String.format("navbar-form%s", Orientation.RIGHT.equals(orientation) ? " navbar-right" : ""));
        putAttribute("action", action);
        putAttribute("method", method.name());
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
