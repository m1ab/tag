/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.builders;

import ru.lumo.html.bs.tag.BsDivFooter;
import ru.lumo.html.bs.tag.CompDivFooter;
import ru.lumo.html.producers.DefaultBsPageProducer;

/**
 *
 * @author misha
 * @param <P>
 */
public class BsFooterBuilder<P extends DefaultBsPageProducer> extends BsBuilder<P, BsDivFooter> {

    public BsDivFooter build() {
        return new CompDivFooter(producer.getCopyright());
    }
}
