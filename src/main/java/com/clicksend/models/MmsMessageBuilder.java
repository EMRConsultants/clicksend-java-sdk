/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class MmsMessageBuilder {
    //the instance to build
    private MmsMessage mmsMessage;

    /**
     * Default constructor to initialize the instance
     */
    public MmsMessageBuilder() {
        mmsMessage = new MmsMessage();
    }

    /**
     * Recipient phone number in E.164 format
     */
    public MmsMessageBuilder to(String to) {
        mmsMessage.setTo(to);
        return this;
    }

    /**
     * Your message
     */
    public MmsMessageBuilder body(String body) {
        mmsMessage.setBody(body);
        return this;
    }

    /**
     * Subject line (max 20 characters)
     */
    public MmsMessageBuilder subject(String subject) {
        mmsMessage.setSubject(subject);
        return this;
    }

    /**
     * Your sender ID
     */
    public MmsMessageBuilder from(String from) {
        mmsMessage.setFrom(from);
        return this;
    }

    /**
     * Recipient country
     */
    public MmsMessageBuilder country(String country) {
        mmsMessage.setCountry(country);
        return this;
    }

    /**
     * Your method of sending
     */
    public MmsMessageBuilder source(String source) {
        mmsMessage.setSource(source);
        return this;
    }

    /**
     * Your list ID if sending to a whole list (can be used instead of 'to')
     */
    public MmsMessageBuilder listId(Integer listId) {
        mmsMessage.setListId(listId);
        return this;
    }

    /**
     * Schedule time in unix format (leave blank for immediate delivery)
     */
    public MmsMessageBuilder schedule(Integer schedule) {
        mmsMessage.setSchedule(schedule);
        return this;
    }

    /**
     * Custom string for your reference
     */
    public MmsMessageBuilder customString(String customString) {
        mmsMessage.setCustomString(customString);
        return this;
    }

    /**
     * Email to send replies to
     */
    public MmsMessageBuilder fromEmail(String fromEmail) {
        mmsMessage.setFromEmail(fromEmail);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MmsMessage build() {
        return mmsMessage;
    }
}