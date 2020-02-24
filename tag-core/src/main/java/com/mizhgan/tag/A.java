/*
 * No fuck license
 */

package com.mizhgan.tag;

/**
 *
 * @author mizhgan
 */
public class A extends Tag {
    
    public enum Scope {href, name}
    
    public A(String link) {
        super("a");
        putAttribute(Scope.href.name(), link);
    }
    
    public A(String link, Lit l) {
        super("a");
        putAttribute(Scope.href.name(), link);
        add(l);
    }
    
    public A(Scope scope, String ancor) {
        super("a");
        putAttribute(scope.name(), ancor);
    }
    
    public A(Scope scope, String ancor, Lit l) {
        super("a");
        putAttribute(scope.name(), ancor);
        add(l);
    }
}
