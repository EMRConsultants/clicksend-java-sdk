/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class VoiceMessageCollection 
        implements java.io.Serializable {
<<<<<<< Updated upstream
    private static final long serialVersionUID = 5421698517763769234L;
=======
    private static final long serialVersionUID = 5213296937040580405L;
>>>>>>> Stashed changes
    private List<VoiceMessage> messages;
    /** GETTER
     * Array of VoiceMessage items
     */
    @JsonGetter("messages")
    public List<VoiceMessage> getMessages ( ) { 
        return this.messages;
    }
    
    /** SETTER
     * Array of VoiceMessage items
     */
    @JsonSetter("messages")
    public void setMessages (List<VoiceMessage> value) { 
        this.messages = value;
    }
 
}
 