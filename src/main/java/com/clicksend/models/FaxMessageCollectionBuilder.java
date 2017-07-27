/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class FaxMessageCollectionBuilder {
    //the instance to build
    private FaxMessageCollection faxMessageCollection;

    /**
     * Default constructor to initialize the instance
     */
    public FaxMessageCollectionBuilder() {
        faxMessageCollection = new FaxMessageCollection();
    }

    /**
     * Array of FaxMessage items
     */
    public FaxMessageCollectionBuilder messages(List<FaxMessage> messages) {
        faxMessageCollection.setMessages(messages);
        return this;
    }

    /**
     * URL of file to send
     */
    public FaxMessageCollectionBuilder fileUrl(String fileUrl) {
        faxMessageCollection.setFileUrl(fileUrl);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public FaxMessageCollection build() {
        return faxMessageCollection;
    }
}