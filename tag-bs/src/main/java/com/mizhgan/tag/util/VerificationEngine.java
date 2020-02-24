/*
 * No fuck license
 */

package com.mizhgan.tag.util;

/**
 *
 * @author mizhgan
 */
public enum VerificationEngine {
    VERIFICATION_YANDEX("yandex-verification");
    
    private final String name;
    
    VerificationEngine(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
