/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.lumo.html.tag;

import java.util.Map;

/**
 *
 * @author misha
 */
public class Meta extends Tag {
    
    public static final String CHARSET = "charset";
    public static final String HTTP_EQUIV = "http-equiv";
    public static final String NAME = "name";
    public static final String CONTENT = "content";
    
    public static final String DESCRIPTION = "description";
    public static final String KEYWORDS = "keywords";
    
    public Meta(Map<String, String> attributes) {
        super("meta");
        putAttributes(attributes);
    }
    
    public Meta(String charset) {
        super("meta");
        putAttribute(CHARSET, charset);
    }
    
    public Meta(String name, String content) {
        super("meta");
        putAttribute(NAME, name);
        putAttribute(CONTENT, content);
    }
}
