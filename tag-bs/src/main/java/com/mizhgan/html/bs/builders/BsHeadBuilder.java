/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizhgan.html.bs.builders;

import com.mizhgan.html.producers.BsPageProducer;
import com.mizhgan.html.tag.*;
import com.mizhgan.html.util.VerificationEngine;

/**
 *
 * @author mizhgan, 11.11.2019
 * @param <P>
 */
public class BsHeadBuilder<P extends BsPageProducer> extends AbstractBsBuilder<P, Head> {

    public BsHeadBuilder(P producer) {
        super(producer);
    }

    @Override
    public Head build() {
        Head head = new Head();
        head.add(new Meta(producer.getCharset()));
        head.add(new Meta(producer.getHttpEquiv()));
        head.add(new Meta(producer.getViewport()));
        head.add(new Title(new Lit(producer.getTitle())));
        head.add(new Meta(Meta.DESCRIPTION, producer.getDescription()));
        head.add(new Meta(Meta.KEYWORDS, producer.getKeywords()));
        head.add(new Meta(VerificationEngine.VERIFICATION_YANDEX.getName(),
                producer.getVerification(
                        VerificationEngine.VERIFICATION_YANDEX)));
        head.add(new Link(Link.REL_SHORTCUT_ICON, producer.getFavicon()));
        for (String css : producer.getCssLinks()) {
            head.add(new Link(Link.REL_STYLESHEET, css));
        }
        head.add(producer.getDebugHeadData());
        return head;
    }
}
