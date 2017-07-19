/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class PostPostcardBuilder {
    //the instance to build
    private PostPostcard postPostcard;

    /**
     * Default constructor to initialize the instance
     */
    public PostPostcardBuilder() {
        postPostcard = new PostPostcard();
    }

    /**
     * Postcard file URLs
     */
    public PostPostcardBuilder fileUrls(List<String> fileUrls) {
        postPostcard.setFileUrls(fileUrls);
        return this;
    }

    /**
     * Array of recipients
     */
    public PostPostcardBuilder recipients(List<PostRecipient> recipients) {
        postPostcard.setRecipients(recipients);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PostPostcard build() {
        return postPostcard;
    }
}