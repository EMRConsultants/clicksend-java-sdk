/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class SmsCampaignBuilder {
    //the instance to build
    private SmsCampaign smsCampaign;

    /**
     * Default constructor to initialize the instance
     */
    public SmsCampaignBuilder() {
        smsCampaign = new SmsCampaign();
    }

    /**
     * Your list id.
     */
    public SmsCampaignBuilder listId(Object listId) {
        smsCampaign.setListId(listId);
        return this;
    }

    /**
     * Your campaign name.
     */
    public SmsCampaignBuilder name(String name) {
        smsCampaign.setName(name);
        return this;
    }

    /**
     * Your campaign message.
     */
    public SmsCampaignBuilder body(String body) {
        smsCampaign.setBody(body);
        return this;
    }

    /**
     * Your schedule timestamp.
     */
    public SmsCampaignBuilder schedule(String schedule) {
        smsCampaign.setSchedule(schedule);
        return this;
    }

    /**
     * Your sender id - more info: http://help.clicksend.com/SMS/what-is-a-sender-id-or-sender-number.
     */
    public SmsCampaignBuilder from(String from) {
        smsCampaign.setFrom(from);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SmsCampaign build() {
        return smsCampaign;
    }
}