/*
 * No fuck license
 */

package com.mizhgan.tag;

/**
 * Created by misha on 30.04.16.
 */
public class Lit {

    private StringBuffer buffer;

    public Lit() {
    }

    public Lit(String s) {
        buffer = new StringBuffer(s);
    }

    protected Lit(String s, int capacity) {
        buffer = new StringBuffer(s.length() + capacity);
        buffer.append(s);
    }

    protected StringBuffer getBuffer() {
        return buffer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lit lit = (Lit) o;

        return !(buffer != null ? !buffer.equals(lit.buffer) : lit.buffer != null);

    }

    @Override
    public int hashCode() {
        return buffer != null ? buffer.hashCode() : 0;
    }

    @Override
    public String toString() {
        return buffer == null ? "" : buffer.toString();
    }
}
