/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MmsMessageCollection 
        implements java.io.Serializable {
<<<<<<< Updated upstream
    private static final long serialVersionUID = 5592998239082411285L;
=======
    private static final long serialVersionUID = 4741740100760653307L;
>>>>>>> Stashed changes
    private String mediaFile;
    private List<MmsMessage> messages;
    /** GETTER
     * Media file you want to send
     */
    @JsonGetter("media_file")
    public String getMediaFile ( ) { 
        return this.mediaFile;
    }
    
    /** SETTER
     * Media file you want to send
     */
    @JsonSetter("media_file")
    public void setMediaFile (String value) { 
        this.mediaFile = value;
    }
 
    /** GETTER
     * Array of MmsMessage models
     */
    @JsonGetter("messages")
    public List<MmsMessage> getMessages ( ) { 
        return this.messages;
    }
    
    /** SETTER
     * Array of MmsMessage models
     */
    @JsonSetter("messages")
    public void setMessages (List<MmsMessage> value) { 
        this.messages = value;
    }
 
}
 