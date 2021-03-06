/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mizhgan.html.bs.tag;

import com.mizhgan.html.tag.Lit;

/**
 *
 * @author mizhgan, 11.11.2019
 */
public class CompDivNavbarHeader extends BsDiv {

    public CompDivNavbarHeader() {
        super("navbar-header");
        BsButton button = new BsButton(BsButton.Type.BUTTON, "navbar-toggle");
        button.putAttribute("data-toggle", "collapse");
        button.putAttribute("data-target", ".navbar-collapse");
        BsSpan span = new BsSpan("sr-only");
        span.add(new Lit("Toggle navigation"));
        button.add(span);
        for (int i = 0; i < 3; i++) {
            span = new BsSpan("icon-bar");
            span.add(new Lit());
            button.add(span);
        }
        add(button);
    }
    
    public void addBrand(String brand, String title, String link) {
        BsA a = new BsA("navbar-brand", link);
        a.putAttribute("title", title);
        a.add(new Lit(brand));
        add(a);
    }
    
}
