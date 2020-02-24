/*
 * No fuck license
 */

package com.mizhgan.tag.bs.builders;

import com.mizhgan.tag.bs.tag.BsDivFooter;
import com.mizhgan.tag.bs.tag.CompDivFooter;
import com.mizhgan.tag.producers.BsPageProducer;

/**
 * @param <P>
 * @author mizhgan
 */
public class BsFooterBuilder<P extends BsPageProducer> extends AbstractBsBuilder<P, BsDivFooter> {

    public BsFooterBuilder(P producer) {
        super(producer);
    }

    @Override
    public BsDivFooter build() {
        return new CompDivFooter(producer.getCopyright());
    }
}
