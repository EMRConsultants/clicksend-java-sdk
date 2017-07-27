/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SmsMessage 
        implements java.io.Serializable {
<<<<<<< Updated upstream
    private static final long serialVersionUID = 5214196214438457571L;
=======
    private static final long serialVersionUID = 5500918811825822119L;
>>>>>>> Stashed changes
    private String from;
    private String body;
    private String to = "0411111111";
    private String source = "sdk";
    private Integer schedule = 0;
    private String customString;
    private Integer listId;
    private String country;
    private String fromEmail;
    /** GETTER
     * Your sender id - more info: http://help.clicksend.com/SMS/what-is-a-sender-id-or-sender-number.
     */
    @JsonGetter("from")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * Your sender id - more info: http://help.clicksend.com/SMS/what-is-a-sender-id-or-sender-number.
     */
    @JsonSetter("from")
    public void setFrom (String value) { 
        this.from = value;
    }
 
    /** GETTER
     * Your message.
     */
    @JsonGetter("body")
    public String getBody ( ) { 
        return this.body;
    }
    
    /** SETTER
     * Your message.
     */
    @JsonSetter("body")
    public void setBody (String value) { 
        this.body = value;
    }
 
    /** GETTER
     * Recipient phone number in E.164 format.
     */
    @JsonGetter("to")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * Recipient phone number in E.164 format.
     */
    @JsonSetter("to")
    public void setTo (String value) { 
        this.to = value;
    }
 
    /** GETTER
     * Your method of sending e.g. 'wordpress', 'php', 'c#'.
     */
    @JsonGetter("source")
    public String getSource ( ) { 
        return this.source;
    }
    
    /** SETTER
     * Your method of sending e.g. 'wordpress', 'php', 'c#'.
     */
    @JsonSetter("source")
    public void setSource (String value) { 
        this.source = value;
    }
 
    /** GETTER
     * Leave blank for immediate delivery. Your schedule time in unix format http://help.clicksend.com/what-is-a-unix-timestamp
     */
    @JsonGetter("schedule")
    public Integer getSchedule ( ) { 
        return this.schedule;
    }
    
    /** SETTER
     * Leave blank for immediate delivery. Your schedule time in unix format http://help.clicksend.com/what-is-a-unix-timestamp
     */
    @JsonSetter("schedule")
    public void setSchedule (Integer value) { 
        this.schedule = value;
    }
 
    /** GETTER
     * Your reference. Will be passed back with all replies and delivery reports.
     */
    @JsonGetter("custom_string")
    public String getCustomString ( ) { 
        return this.customString;
    }
    
    /** SETTER
     * Your reference. Will be passed back with all replies and delivery reports.
     */
    @JsonSetter("custom_string")
    public void setCustomString (String value) { 
        this.customString = value;
    }
 
    /** GETTER
     * Your list ID if sending to a whole list. Can be used instead of 'to'.
     */
    @JsonGetter("list_id")
    public Integer getListId ( ) { 
        return this.listId;
    }
    
    /** SETTER
     * Your list ID if sending to a whole list. Can be used instead of 'to'.
     */
    @JsonSetter("list_id")
    public void setListId (Integer value) { 
        this.listId = value;
    }
 
    /** GETTER
     * Recipient country.
     */
    @JsonGetter("country")
    public String getCountry ( ) { 
        return this.country;
    }
    
    /** SETTER
     * Recipient country.
     */
    @JsonSetter("country")
    public void setCountry (String value) { 
        this.country = value;
    }
 
    /** GETTER
     * An email address where the reply should be emailed to. If omitted, the reply will be emailed back to the user who sent the outgoing SMS.
     */
    @JsonGetter("from_email")
    public String getFromEmail ( ) { 
        return this.fromEmail;
    }
    
    /** SETTER
     * An email address where the reply should be emailed to. If omitted, the reply will be emailed back to the user who sent the outgoing SMS.
     */
    @JsonSetter("from_email")
    public void setFromEmail (String value) { 
        this.fromEmail = value;
    }
 
}
 