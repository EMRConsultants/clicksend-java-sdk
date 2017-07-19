/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class SmsCampaignListBuilder {
    //the instance to build
    private SmsCampaignList smsCampaignList;

    /**
     * Default constructor to initialize the instance
     */
    public SmsCampaignListBuilder() {
        smsCampaignList = new SmsCampaignList();
    }

    public SmsCampaignListBuilder smsCampaigns(SmsCampaign smsCampaigns) {
        smsCampaignList.setSmsCampaigns(smsCampaigns);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SmsCampaignList build() {
        return smsCampaignList;
    }
}