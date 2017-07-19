/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class SmsMessageCollectionBuilder {
    //the instance to build
    private SmsMessageCollection smsMessageCollection;

    /**
     * Default constructor to initialize the instance
     */
    public SmsMessageCollectionBuilder() {
        smsMessageCollection = new SmsMessageCollection();
    }

    /**
     * Array of SmsMessage items
     */
    public SmsMessageCollectionBuilder messages(List<SmsMessage> messages) {
        smsMessageCollection.setMessages(messages);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SmsMessageCollection build() {
        return smsMessageCollection;
    }
}