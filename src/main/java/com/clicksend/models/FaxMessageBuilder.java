/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class FaxMessageBuilder {
    //the instance to build
    private FaxMessage faxMessage;

    /**
     * Default constructor to initialize the instance
     */
    public FaxMessageBuilder() {
        faxMessage = new FaxMessage();
    }

    /**
     * Your method of sending e.g. 'wordpress', 'php', 'c#'.
     */
    public FaxMessageBuilder source(String source) {
        faxMessage.setSource(source);
        return this;
    }

    /**
     * Recipient fax number in E.164 format.
     */
    public FaxMessageBuilder to(String to) {
        faxMessage.setTo(to);
        return this;
    }

    /**
     * Your list ID if sending to a whole list. Can be used instead of 'to'.
     */
    public FaxMessageBuilder listId(Integer listId) {
        faxMessage.setListId(listId);
        return this;
    }

    /**
     * Your sender id. Must be a valid fax number.
     */
    public FaxMessageBuilder from(String from) {
        faxMessage.setFrom(from);
        return this;
    }

    /**
     * Leave blank for immediate delivery. Your schedule time in unix format http://help.clicksend.com/what-is-a-unix-timestamp
     */
    public FaxMessageBuilder schedule(Integer schedule) {
        faxMessage.setSchedule(schedule);
        return this;
    }

    /**
     * Your reference. Will be passed back with all replies and delivery reports.
     */
    public FaxMessageBuilder customString(String customString) {
        faxMessage.setCustomString(customString);
        return this;
    }

    /**
     * Recipient country.
     */
    public FaxMessageBuilder country(String country) {
        faxMessage.setCountry(country);
        return this;
    }

    /**
     * An email address where the reply should be emailed to.
     */
    public FaxMessageBuilder fromEmail(String fromEmail) {
        faxMessage.setFromEmail(fromEmail);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public FaxMessage build() {
        return faxMessage;
    }
}