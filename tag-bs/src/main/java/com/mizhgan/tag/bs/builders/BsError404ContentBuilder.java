/*
 * No fuck license
 */

package com.mizhgan.tag.bs.builders;

import com.mizhgan.tag.Code;
import com.mizhgan.tag.H;
import com.mizhgan.tag.Lit;
import com.mizhgan.tag.P;
import com.mizhgan.tag.bs.tag.BsSpanLabel;
import com.mizhgan.tag.bs.tag.StyleLabel;
import com.mizhgan.tag.producers.BsPageProducer;

import java.util.ArrayList;
import java.util.List;

/**
 * @param <T>
 * @author mizhgan
 */
public class BsError404ContentBuilder<T extends BsPageProducer> extends AbstractBsBuilder<T, List<Object>> {

    public BsError404ContentBuilder(T producer) {
        super(producer);
    }

    @Override
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
