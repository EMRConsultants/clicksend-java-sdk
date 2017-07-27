/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MmsMessage 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5190634045193774581L;
    private String to = "0411111111";
    private String body;
    private String subject;
    private String from;
    private String country;
    private String source = "sdk";
    private Integer listId;
    private Integer schedule = 0;
    private String customString;
    private String fromEmail;
    /** GETTER
     * Recipient phone number in E.164 format
     */
    @JsonGetter("to")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * Recipient phone number in E.164 format
     */
    @JsonSetter("to")
    public void setTo (String value) { 
        this.to = value;
    }
 
    /** GETTER
     * Your message
     */
    @JsonGetter("body")
    public String getBody ( ) { 
        return this.body;
    }
    
    /** SETTER
     * Your message
     */
    @JsonSetter("body")
    public void setBody (String value) { 
        this.body = value;
    }
 
    /** GETTER
     * Subject line (max 20 characters)
     */
    @JsonGetter("subject")
    public String getSubject ( ) { 
        return this.subject;
    }
    
    /** SETTER
     * Subject line (max 20 characters)
     */
    @JsonSetter("subject")
    public void setSubject (String value) { 
        this.subject = value;
    }
 
    /** GETTER
     * Your sender ID
     */
    @JsonGetter("from")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * Your sender ID
     */
    @JsonSetter("from")
    public void setFrom (String value) { 
        this.from = value;
    }
 
    /** GETTER
     * Recipient country
     */
    @JsonGetter("country")
    public String getCountry ( ) { 
        return this.country;
    }
    
    /** SETTER
     * Recipient country
     */
    @JsonSetter("country")
    public void setCountry (String value) { 
        this.country = value;
    }
 
    /** GETTER
     * Your method of sending
     */
    @JsonGetter("source")
    public String getSource ( ) { 
        return this.source;
    }
    
    /** SETTER
     * Your method of sending
     */
    @JsonSetter("source")
    public void setSource (String value) { 
        this.source = value;
    }
 
    /** GETTER
     * Your list ID if sending to a whole list (can be used instead of 'to')
     */
    @JsonGetter("list_id")
    public Integer getListId ( ) { 
        return this.listId;
    }
    
    /** SETTER
     * Your list ID if sending to a whole list (can be used instead of 'to')
     */
    @JsonSetter("list_id")
    public void setListId (Integer value) { 
        this.listId = value;
    }
 
    /** GETTER
     * Schedule time in unix format (leave blank for immediate delivery)
     */
    @JsonGetter("schedule")
    public Integer getSchedule ( ) { 
        return this.schedule;
    }
    
    /** SETTER
     * Schedule time in unix format (leave blank for immediate delivery)
     */
    @JsonSetter("schedule")
    public void setSchedule (Integer value) { 
        this.schedule = value;
    }
 
    /** GETTER
     * Custom string for your reference
     */
    @JsonGetter("custom_string")
    public String getCustomString ( ) { 
        return this.customString;
    }
    
    /** SETTER
     * Custom string for your reference
     */
    @JsonSetter("custom_string")
    public void setCustomString (String value) { 
        this.customString = value;
    }
 
    /** GETTER
     * Email to send replies to
     */
    @JsonGetter("from_email")
    public String getFromEmail ( ) { 
        return this.fromEmail;
    }
    
    /** SETTER
     * Email to send replies to
     */
    @JsonSetter("from_email")
    public void setFromEmail (String value) { 
        this.fromEmail = value;
    }
 
}
 