/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class MmsMessageCollectionBuilder {
    //the instance to build
    private MmsMessageCollection mmsMessageCollection;

    /**
     * Default constructor to initialize the instance
     */
    public MmsMessageCollectionBuilder() {
        mmsMessageCollection = new MmsMessageCollection();
    }

    /**
     * Media file you want to send
     */
    public MmsMessageCollectionBuilder mediaFile(String mediaFile) {
        mmsMessageCollection.setMediaFile(mediaFile);
        return this;
    }

    /**
     * Array of MmsMessage models
     */
    public MmsMessageCollectionBuilder messages(List<MmsMessage> messages) {
        mmsMessageCollection.setMessages(messages);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MmsMessageCollection build() {
        return mmsMessageCollection;
    }
}