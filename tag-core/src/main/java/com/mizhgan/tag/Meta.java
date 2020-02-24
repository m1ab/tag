/*
 * No fuck license
 */

package com.mizhgan.tag;

import java.util.Map;

/**
 *
 * @author mizhgan
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
