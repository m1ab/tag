/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.lumo.html.bs.tag;

/**
 *
 * @author misha
 */
public class BsDivSiteWrapper extends BsDiv {

    private BsDivCoverContainer coverContainer;

    public BsDivSiteWrapper() {
        super("site-wrapper");
        BsDiv innerSiteWrapper = new BsDiv("site-wrapper-inner");
        coverContainer = new BsDivCoverContainer();
        innerSiteWrapper.add(coverContainer);
        add(innerSiteWrapper);
    }

    public BsDivCoverContainer getCoverContainer() {
        return coverContainer;
    }
}
