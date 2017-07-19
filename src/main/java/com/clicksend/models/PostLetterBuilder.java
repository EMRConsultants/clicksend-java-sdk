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

    public PostLetterBuilder fileUrl(String fileUrl) {
        postLetter.setFileUrl(fileUrl);
        return this;
    }

    public PostLetterBuilder recipients(List<PostRecipient> recipients) {
        postLetter.setRecipients(recipients);
        return this;
    }

    public PostLetterBuilder templateUsed(Boolean templateUsed) {
        postLetter.setTemplateUsed(templateUsed);
        return this;
    }

    public PostLetterBuilder duplex(Boolean duplex) {
        postLetter.setDuplex(duplex);
        return this;
    }

    public PostLetterBuilder colour(Boolean colour) {
        postLetter.setColour(colour);
        return this;
    }

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