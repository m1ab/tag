/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.lumo.html.tag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author misha
 */
public class Tag {
    
    private final String name;
    
    protected final Map<String, String> attributes = new HashMap<>();
    
    private final List<String> flags = new ArrayList<>();
    
    private final List<Object> contents = new ArrayList<>();
    
    public Tag(String name) {
        this.name = name;
    }
    
    public void putAttribute(String name, String value) {
        attributes.put(name, value);
    }
    
    public void putAttributes(Map<String, String> attributes) {
        for (String key : attributes.keySet()) {
            putAttribute(key, attributes.get(key));
        }
    }
    
    public void addFlag(String flag) {
        flags.add(flag);
    }
    
    public void add(Tag tag) {
        contents.add(tag);
    }
    
    public void add(String s) {
        contents.add(s);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(name);
        for (String attr : attributes.keySet()) {
            sb.append(" ").append(attr).append("=\"")
                    .append(attributes.get(attr)).append("\"");
        }
        for (String flag : flags) {
            sb.append(" ").append(flag);
        }
        sb.append(">");
        if (!contents.isEmpty()) {
            for (Object content : contents) {
                sb.append(content.toString());
            }
            sb.append("</").append(name).append(">");
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tag other = (Tag) obj;
        return !((this.name == null) ?
                (other.name != null) : !this.name.equals(other.name));
    }


}
