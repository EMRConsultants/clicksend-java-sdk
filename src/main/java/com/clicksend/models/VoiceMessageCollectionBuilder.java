/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class VoiceMessageCollectionBuilder {
    //the instance to build
    private VoiceMessageCollection voiceMessageCollection;

    /**
     * Default constructor to initialize the instance
     */
    public VoiceMessageCollectionBuilder() {
        voiceMessageCollection = new VoiceMessageCollection();
    }

    /**
     * Array of VoiceMessage items
     */
    public VoiceMessageCollectionBuilder messages(List<VoiceMessage> messages) {
        voiceMessageCollection.setMessages(messages);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public VoiceMessageCollection build() {
        return voiceMessageCollection;
    }
}