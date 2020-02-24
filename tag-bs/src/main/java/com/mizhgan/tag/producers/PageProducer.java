/*
 * No fuck license
 */

package com.mizhgan.tag.producers;

import java.util.List;

import com.mizhgan.tag.Lit;
import com.mizhgan.tag.util.VerificationEngine;

/**
 *
 * @author mizhgan
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

    Lit getCopyright();
    
    List<String> getCssLinks();
    
    List<String> getCounters();
    
    String getReturnHomeName();
    
    String getPageTopName();
    
}
