/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.util;

/**
 *
 * @author misha
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
