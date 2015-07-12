/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.lumo.html.producers;

import java.util.List;
import ru.lumo.html.util.VerificationEngine;

/**
 *
 * @author misha
 */
public interface PageProducer {
    
    String getBase();
    
    String getLang();
    
    String getCharset();
    
    String getTitle();
    
    String getDescription();
    
    String getKeywords();
    
    String getFavicon();
    
    String getVerification(VerificationEngine engine);
    
    String getCopyright();
    
    List<String> getCssLinks();
    
    List<String> getCounters();
    
    String getReturnHomeName();
    
    String getPageTopName();
    
}
