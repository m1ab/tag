/*
 * No fuck license
 */

package com.mizhgan.tag.producers;

import com.mizhgan.tag.Lit;

import java.util.List;
import java.util.Map;

/**
 *
 * @author mizhgan
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
