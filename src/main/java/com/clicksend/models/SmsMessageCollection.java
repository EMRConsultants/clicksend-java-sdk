/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SmsMessageCollection 
        implements java.io.Serializable {
<<<<<<< Updated upstream
    private static final long serialVersionUID = 5292340211568551859L;
=======
    private static final long serialVersionUID = 5667613380548138530L;
>>>>>>> Stashed changes
    private List<SmsMessage> messages;
    /** GETTER
     * Array of SmsMessage items
     */
    @JsonGetter("messages")
    public List<SmsMessage> getMessages ( ) { 
        return this.messages;
    }
    
    /** SETTER
     * Array of SmsMessage items
     */
    @JsonSetter("messages")
    public void setMessages (List<SmsMessage> value) { 
        this.messages = value;
    }
 
}
 