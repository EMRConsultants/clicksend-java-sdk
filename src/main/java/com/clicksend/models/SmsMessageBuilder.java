/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class SmsMessageBuilder {
    //the instance to build
    private SmsMessage smsMessage;

    /**
     * Default constructor to initialize the instance
     */
    public SmsMessageBuilder() {
        smsMessage = new SmsMessage();
    }

    /**
     * Your sender id - more info: http://help.clicksend.com/SMS/what-is-a-sender-id-or-sender-number.
     */
    public SmsMessageBuilder from(String from) {
        smsMessage.setFrom(from);
        return this;
    }

    /**
     * Your message.
     */
    public SmsMessageBuilder body(String body) {
        smsMessage.setBody(body);
        return this;
    }

    /**
     * Recipient phone number in E.164 format.
     */
    public SmsMessageBuilder to(String to) {
        smsMessage.setTo(to);
        return this;
    }

    /**
     * Your method of sending e.g. 'wordpress', 'php', 'c#'.
     */
    public SmsMessageBuilder source(String source) {
        smsMessage.setSource(source);
        return this;
    }

    /**
     * Leave blank for immediate delivery. Your schedule time in unix format http://help.clicksend.com/what-is-a-unix-timestamp
     */
    public SmsMessageBuilder schedule(Integer schedule) {
        smsMessage.setSchedule(schedule);
        return this;
    }

    /**
     * Your reference. Will be passed back with all replies and delivery reports.
     */
    public SmsMessageBuilder customString(String customString) {
        smsMessage.setCustomString(customString);
        return this;
    }

    /**
     * Your list ID if sending to a whole list. Can be used instead of 'to'.
     */
    public SmsMessageBuilder listId(Integer listId) {
        smsMessage.setListId(listId);
        return this;
    }

    /**
     * Recipient country.
     */
    public SmsMessageBuilder country(String country) {
        smsMessage.setCountry(country);
        return this;
    }

    /**
     * An email address where the reply should be emailed to. If omitted, the reply will be emailed back to the user who sent the outgoing SMS.
     */
    public SmsMessageBuilder fromEmail(String fromEmail) {
        smsMessage.setFromEmail(fromEmail);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SmsMessage build() {
        return smsMessage;
    }
}