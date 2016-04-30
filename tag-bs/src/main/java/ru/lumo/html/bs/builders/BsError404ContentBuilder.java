/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.builders;

import java.util.ArrayList;
import java.util.List;
import ru.lumo.html.bs.tag.BsSpanLabel;
import ru.lumo.html.bs.tag.StyleLabel;
import ru.lumo.html.producers.DefaultBsPageProducer;
import ru.lumo.html.tag.Code;
import ru.lumo.html.tag.H;
import ru.lumo.html.tag.Lit;
import ru.lumo.html.tag.P;

/**
 *
 * @author misha
 * @param <T>
 */
public class BsError404ContentBuilder<T extends DefaultBsPageProducer> extends BsBuilder<T, List<Object>> {

    public List<Object> build() {
        List<Object> contentList = new ArrayList<>();
        BsSpanLabel label = new BsSpanLabel(StyleLabel.DANGER);
        label.add(new Lit("ERROR 404"));
        H h = new H(H.Size.h1, new Lit("Страница не найдена "));
        h.add(label);
        contentList.add(h);
        P p = new P(new Lit("Нет такой страницы по адресу: "));
        p.add(new Code(producer.getCurrentLink()));
        contentList.add(p);
        return contentList;
    }
}
