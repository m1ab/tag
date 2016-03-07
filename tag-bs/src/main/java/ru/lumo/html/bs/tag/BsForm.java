package ru.lumo.html.bs.tag;

/**
 * Created by misha on 07.03.16.
 */
public class BsForm extends BsTag {

    public enum Type {
        FORM_INLINE,
        FORM_HORISONTAL
    }

    public BsForm() {
        this(null);
    }

    public BsForm(Type type) {
        super("form", type == null ? null : type.name().replace("_", "-").toLowerCase());
    }

}
