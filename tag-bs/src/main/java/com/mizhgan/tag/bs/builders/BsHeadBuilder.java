/*
 * No fuck license
 */

package com.mizhgan.tag.bs.builders;

import com.mizhgan.tag.*;
import com.mizhgan.tag.producers.BsPageProducer;
import com.mizhgan.tag.util.VerificationEngine;

/**
 * @param <P>
 * @author mizhgan
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
