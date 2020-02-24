/*
 * No fuck license
 */

package com.mizhgan.tag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mizhgan
 */
public class Tag extends Lit {
    
    private final String name;
    
    protected final Map<String, String> attributes = new HashMap<>();
    
    private final List<String> flags = new ArrayList<>();
    
    private final List<Lit> lits = new ArrayList<>();

    public Tag(String name) {
        super();
        this.name = name;
    }

    protected Tag(String name, int capacity) {
        super("", capacity);
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
    
    public void add(Lit l) {
        lits.add(l);
    }

    public void add(String s) {
        lits.add(new Lit(s));
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append("<").append(name);
        attributes.entrySet().forEach(entry -> sb.append(" ")
                .append(entry.getKey()).append("=\"")
                .append(entry.getValue()).append("\""));
        flags.forEach(flag -> sb.append(" ").append(flag));
        sb.append(">");
        lits.forEach(lit -> sb.append(lit.toString()));
        sb.append("</").append(name).append(">");
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
