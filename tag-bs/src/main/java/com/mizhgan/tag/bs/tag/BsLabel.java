/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

import com.mizhgan.tag.Lit;

/**
 *
 * @author mizhgan
 */
public class BsLabel extends BsTag {

    public final static String CONTROL_LABEL_CLASS="control-label";

    public BsLabel(String tagClass, String id) {
        this(tagClass, id, new Lit());
    }

    public BsLabel(String tagClass, String id, Lit l) {
        super("label", tagClass);
        putAttribute("for", id);
        add(l);
    }

    public BsLabel(String tagClass, String id, String s) {
        super("label", tagClass);
        putAttribute("for", id);
        add(s);
    }
}
