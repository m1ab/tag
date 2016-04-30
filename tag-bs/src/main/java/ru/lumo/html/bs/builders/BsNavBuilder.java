/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.builders;

import java.util.List;
import ru.lumo.html.bs.tag.BsA;
import ru.lumo.html.bs.tag.BsLiTab;
import ru.lumo.html.bs.tag.BsUlNav;
import ru.lumo.html.bs.tag.CompLiNavbarDropdown;
import ru.lumo.html.bs.tag.LinkItem;
import ru.lumo.html.producers.DefaultBsPageProducer;
import ru.lumo.html.tag.Lit;

/**
 *
 * @author misha
 * @param <P>
 */
public class BsNavBuilder<P extends DefaultBsPageProducer> extends BsBuilder<P, BsUlNav> {

    private List<LinkItem> items;
    private BsUlNav.Type type;
    
    public BsNavBuilder<P> setMenu(List<LinkItem> items) {
        this.items = items;
        return this;
    }

    public BsNavBuilder<P> setType(BsUlNav.Type type) {
        this.type = type;
        return this;
    }
    
    public BsUlNav build() {
        BsUlNav nav = new BsUlNav(type);
        items.forEach(item -> {
            if (item.hasChilds()) {
                CompLiNavbarDropdown dropdown = new CompLiNavbarDropdown();
                dropdown.setDropdownName(item.getName());
                dropdown.setDropdownMenu(item.getChilds());
                if (item.isActive()) dropdown.addClass("active");
                nav.add(dropdown);
            } else {
                BsLiTab tab;
                if (item.isActive()) {
                    tab = new BsLiTab(BsLiTab.Type.active);
                } else if (item.isDisabled()) {
                    tab = new BsLiTab(BsLiTab.Type.disabled);
                } else {
                    tab = new BsLiTab();
                }
                BsA a = new BsA(null, item.getLink());
                a.add(new Lit(item.getName()));
                tab.add(a);
                nav.add(tab);
            }
        });
        return nav;
    }
    
    public BsUlNav buildTabs() {
        return setType(BsUlNav.Type.TABS).build();
    }
    
    public BsUlNav buildPills() {
        return setType(BsUlNav.Type.PILLS).build();
    }

    public BsUlNav buildPillsStacked() {
        return setType(BsUlNav.Type.PILLS_STACKED).build();
    }
    
    public BsUlNav buildTabsJustified() {
        return setType(BsUlNav.Type.TABS_JUSTIFIED).build();
    }
    
    public BsUlNav buildPillsJustified() {
        return setType(BsUlNav.Type.PILLS_JUSTIFIED).build();
    }

}
