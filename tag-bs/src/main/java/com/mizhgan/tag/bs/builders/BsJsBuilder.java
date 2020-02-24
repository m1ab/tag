/*
 * No fuck license
 */

package com.mizhgan.tag.bs.builders;

import com.mizhgan.tag.Lit;
import com.mizhgan.tag.Script;
import com.mizhgan.tag.producers.BsPageProducer;

import java.util.ArrayList;
import java.util.List;

/**
 * @param <P>
 * @author mizhgan
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
