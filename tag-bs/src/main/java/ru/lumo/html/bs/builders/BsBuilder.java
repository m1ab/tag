/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.builders;

import ru.lumo.html.bs.tag.BsTag;
import ru.lumo.html.producers.DefaultBsPageProducer;

import javax.inject.Inject;


/**
 *
 * @author misha
 * @param <P>
 */
public abstract class BsBuilder<P extends DefaultBsPageProducer, C> {

    protected P producer;
    
    public void setProducer(P producer) {
        this.producer = producer;
    }

    public abstract C build();
    
}
