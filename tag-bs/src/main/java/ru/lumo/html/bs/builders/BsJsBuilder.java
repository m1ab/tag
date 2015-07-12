/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.builders;

import java.util.ArrayList;
import java.util.List;
import ru.lumo.html.producers.DefaultBsPageProducer;
import ru.lumo.html.tag.Script;

/**
 *
 * @author misha
 * @param <P>
 */
public class BsJsBuilder<P extends DefaultBsPageProducer> extends BsBuilder<P, List<Script>> {

    public List<Script> build() {
        List<Script> scripts = new ArrayList<>();
        for (String link : producer.getBsCoreJavascriptLinks()) {
            Script script = new Script(link);
            script.add("");
            scripts.add(script);
        }
        return scripts;
    }
}
