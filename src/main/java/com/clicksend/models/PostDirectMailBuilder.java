/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class PostDirectMailBuilder {
    //the instance to build
    private PostDirectMail postDirectMail;

    /**
     * Default constructor to initialize the instance
     */
    public PostDirectMailBuilder() {
        postDirectMail = new PostDirectMail();
    }

    /**
     * Campaign name
     */
    public PostDirectMailBuilder name(String name) {
        postDirectMail.setName(name);
        return this;
    }

    /**
     * Campaign file URLs (maximum 2)
     */
    public PostDirectMailBuilder fileUrls(List<String> fileUrls) {
        postDirectMail.setFileUrls(fileUrls);
        return this;
    }

    /**
     * Document size - A5 or DL
     */
    public PostDirectMailBuilder size(String size) {
        postDirectMail.setSize(size);
        return this;
    }

    public PostDirectMailBuilder areas(List<PostDirectMailArea> areas) {
        postDirectMail.setAreas(areas);
        return this;
    }

    /**
     * Leave blank for immediate delivery. Your schedule time in unix format.
     */
    public PostDirectMailBuilder schedule(Integer schedule) {
        postDirectMail.setSchedule(schedule);
        return this;
    }

    /**
     * Your method of sending e.g. 'wordpress', 'php', 'c#'.
     */
    public PostDirectMailBuilder source(String source) {
        postDirectMail.setSource(source);
        return this;
    }

    /**
     * A custom string for your own reference
     */
    public PostDirectMailBuilder customString(String customString) {
        postDirectMail.setCustomString(customString);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PostDirectMail build() {
        return postDirectMail;
    }
}