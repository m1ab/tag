/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.lumo.html.producers;

/**
 *
 * @author misha
 */
public abstract class DefaultPageProducer implements PageProducer {

    @Override
    public String getBase() {
        return "./"; 
    }
    
    @Override
    public String getLang() {
        return "ru";
    }

    @Override
    public String getCharset() {
        return "utf-8";
    }
    
    @Override
    public String getReturnHomeName() {
        return "На главную";
    }
    
    @Override
    public String getPageTopName() {
        return "Наверх";
    }
}
