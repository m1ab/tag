/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizhgan.html.bs.builders;

import com.mizhgan.html.producers.BsPageProducer;
import com.mizhgan.html.tag.Lit;
import com.mizhgan.html.tag.Script;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mizhgan, 11.11.2019
 * @param <P>
 */
public class BsJsBuilder<P extends BsPageProducer> extends AbstractBsBuilder<P, List<Script>> {

    public BsJsBuilder(P producer) {
        super(producer);
    }

    @Override
    public List<Script> build() {
        List<Script> scripts = new ArrayList<>();
        for (String link : producer.getBsCoreJavascriptLinks()) {
            Script script = new Script(link);
            script.add(new Lit());
            scripts.add(script);
        }
        return scripts;
    }
}
