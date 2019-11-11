/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizhgan.html.producers;

import com.mizhgan.html.tag.Lit;

import java.util.List;
import java.util.Map;

/**
 *
 * @author mizhgan, 11.11.2019
 */
public interface BsPageProducer extends PageProducer {
    
    Map<String, String> getViewport();
    
    Map<String, String> getHttpEquiv();
    
    Lit getDebugHeadData();
    
    List<String> getBsCoreJavascriptLinks();
    
    String getBrand();
    
    String getBrandLink();
    
    String getBrandTitle();
    
    Lit getCurrentLink();
    
    String getDefaultSection();
}
