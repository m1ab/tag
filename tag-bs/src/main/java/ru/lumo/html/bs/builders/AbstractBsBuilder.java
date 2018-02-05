/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.builders;

import ru.lumo.html.producers.PageProducer;


/**
 *
 * @author misha
 * @param <P>
 */
public abstract class AbstractBsBuilder<P extends PageProducer, C> {

    protected P producer;

    protected AbstractBsBuilder(P producer) {
        this.producer = producer;
    }

    public abstract C build();
    
}
