/*
 * No fuck license
 */

package com.mizhgan.tag.producers;

/**
 *
 * @author mizhgan
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
