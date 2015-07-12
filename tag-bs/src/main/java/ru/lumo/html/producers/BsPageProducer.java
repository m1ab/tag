/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.producers;

import java.util.List;
import java.util.Map;

/**
 *
 * @author misha
 */
public interface BsPageProducer extends PageProducer {
    
    Map<String, String> getViewport();
    
    Map<String, String> getHttpEquiv();
    
    String getDebugHeadData();
    
    List<String> getBsCoreJavascriptLinks();
    
    String getBrand();
    
    String getBrandLink();
    
    String getBrandTitle();
    
    String getCurrentLink();
    
    String getDefaultSection();
}
