/*
 * No fuck license
 */

package com.mizhgan.tag.bs.builders;

import com.mizhgan.tag.producers.PageProducer;


/**
 * @param <P>
 * @author mizhgan
 */
public abstract class AbstractBsBuilder<P extends PageProducer, C> {

    protected P producer;

    protected AbstractBsBuilder(P producer) {
        this.producer = producer;
    }

    public abstract C build();

}
