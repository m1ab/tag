/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.lumo.html.tag;

/**
 *
 * @author misha
 */
public class A extends Tag {
    
    public enum Scope {
        HREF("href"),
        NAME("name");
        private final String name;
        Scope(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }
    
    public A(String link) {
        super("a");
        putAttribute(Scope.HREF.getName(), link);
    }
    
    public A(String link, String s) {
        super("a");
        putAttribute(Scope.HREF.getName(), link);
        add(s);
    }
    
    public A(String link, Tag t) {
        super("a");
        putAttribute(Scope.HREF.getName(), link);
        add(t);
    }
    
    public A(Scope scope, String value) {
        super("a");
        putAttribute(scope.getName(), value);
    }
    
    public A(Scope scope, String value, String s) {
        super("a");
        putAttribute(scope.getName(), value);
        add(s);
    }
    
    public A(Scope scope, String value, Tag t) {
        super("a");
        putAttribute(scope.getName(), value);
        add(t);
    }
}
