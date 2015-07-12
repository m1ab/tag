/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.tag;

import java.util.List;
import ru.lumo.html.util.ItemUtils;

import javax.inject.Inject;

/**
 *
 * @author misha
 */
public class CompDivNavbarCollapse extends BsDiv {

    @Inject
    private ItemUtils itemUtils;

    public CompDivNavbarCollapse(List<LinkItem> items) {
        super("collapse navbar-collapse");
        BsUl ulLeft = new BsUl("nav navbar-nav");
        BsUl ulRight = new BsUl("nav navbar-nav navbar-right");
        boolean hasLeftList = false;
        boolean hasRightList = false;
        for (LinkItem item : items) {
            if (item.isAlignRight()) {
                addItem(ulRight, item);
                hasRightList = true;
            } else {
                addItem(ulLeft, item);
                hasLeftList = true;
            }
        }
        if (hasLeftList) add(ulLeft);
        if (hasRightList) add(ulRight);
    }
    
    private void addItem(BsUl ul, LinkItem item) {
        if (item.hasChilds()) {
            CompLiNavbarDropdown dropdown = 
                    new CompLiNavbarDropdown(item.getVisibilities());
            
            dropdown.setDropdownName(itemUtils.makeItemName(item));
            dropdown.setDropdownMenu(item.getChilds());
            ul.add(dropdown);
        } else {
            CompLiNavbarLink link = item.isActive()
                    ? new CompLiNavbarLink("active", itemUtils.makeItemName(item), item.getLink())
                    : new CompLiNavbarLink(itemUtils.makeItemName(item), item.getLink());
            link.setVisibilities(item.getVisibilities());
            ul.add(link);
        }
    }
    
    
}
