/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class VoiceMessageBuilder {
    //the instance to build
    private VoiceMessage voiceMessage;

    /**
     * Default constructor to initialize the instance
     */
    public VoiceMessageBuilder() {
        voiceMessage = new VoiceMessage();
    }

    /**
     * Your phone number in E.164 format.
     */
    public VoiceMessageBuilder to(String to) {
        voiceMessage.setTo(to);
        return this;
    }

    /**
     * Biscuit uv3nlCOjRk croissant chocolate lollipop chocolate muffin.
     */
    public VoiceMessageBuilder body(String body) {
        voiceMessage.setBody(body);
        return this;
    }

    /**
     * Either 'female' or 'male'.
     */
    public VoiceMessageBuilder voice(String voice) {
        voiceMessage.setVoice(voice);
        return this;
    }

    /**
     * Your reference. Will be passed back with all replies and delivery reports.
     */
    public VoiceMessageBuilder customString(String customString) {
        voiceMessage.setCustomString(customString);
        return this;
    }

    /**
     * The country of the recipient.
     */
    public VoiceMessageBuilder country(String country) {
        voiceMessage.setCountry(country);
        return this;
    }

    /**
     * Your method of sending e.g. 'wordpress', 'php', 'c#'.
     */
    public VoiceMessageBuilder source(String source) {
        voiceMessage.setSource(source);
        return this;
    }

    /**
     * Your list ID if sending to a whole list. Can be used instead of 'to'.
     */
    public VoiceMessageBuilder listId(Integer listId) {
        voiceMessage.setListId(listId);
        return this;
    }

    /**
     * au (string, required) - See section on available languages.
     */
    public VoiceMessageBuilder lang(String lang) {
        voiceMessage.setLang(lang);
        return this;
    }

    /**
     * Leave blank for immediate delivery. Your schedule time in unix format http://help.clicksend.com/what-is-a-unix-timestamp
     */
    public VoiceMessageBuilder schedule(Integer schedule) {
        voiceMessage.setSchedule(schedule);
        return this;
    }

    /**
     * Whether you want to receive a keypress from the call recipient
     */
    public VoiceMessageBuilder requireInput(Integer requireInput) {
        voiceMessage.setRequireInput(requireInput);
        return this;
    }

    /**
     * Whether to attempt to detect an answering machine or voicemail service and leave a message
     */
    public VoiceMessageBuilder machineDetection(Integer machineDetection) {
        voiceMessage.setMachineDetection(machineDetection);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public VoiceMessage build() {
        return voiceMessage;
    }
}