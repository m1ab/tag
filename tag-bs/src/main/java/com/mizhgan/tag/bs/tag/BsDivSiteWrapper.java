/*
 * No fuck license
 */

package com.mizhgan.tag.bs.tag;

/**
 *
 * @author mizhgan
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
