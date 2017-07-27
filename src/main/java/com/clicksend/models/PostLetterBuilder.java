/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class PostLetterBuilder {
    //the instance to build
    private PostLetter postLetter;

    /**
     * Default constructor to initialize the instance
     */
    public PostLetterBuilder() {
        postLetter = new PostLetter();
    }

    /**
     * URL of file to send
     */
    public PostLetterBuilder fileUrl(String fileUrl) {
        postLetter.setFileUrl(fileUrl);
        return this;
    }

    /**
     * Array of PostRecipient models
     */
    public PostLetterBuilder recipients(List<PostRecipient> recipients) {
        postLetter.setRecipients(recipients);
        return this;
    }

    /**
     * Whether using our template
     */
    public PostLetterBuilder templateUsed(Boolean templateUsed) {
        postLetter.setTemplateUsed(templateUsed);
        return this;
    }

    /**
     * Whether letter is duplex
     */
    public PostLetterBuilder duplex(Boolean duplex) {
        postLetter.setDuplex(duplex);
        return this;
    }

    /**
     * Whether letter is in colour
     */
    public PostLetterBuilder colour(Boolean colour) {
        postLetter.setColour(colour);
        return this;
    }

    /**
     * Source being sent from
     */
    public PostLetterBuilder source(String source) {
        postLetter.setSource(source);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PostLetter build() {
        return postLetter;
    }
}