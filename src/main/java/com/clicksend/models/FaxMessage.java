/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FaxMessage 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5679878229012350371L;
    private String source;
    private String to;
    private Integer listId;
    private String from;
    private Integer schedule;
    private String customString;
    private String country;
    private String fromEmail;
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
     * Recipient fax number in E.164 format.
     */
    @JsonGetter("to")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * Recipient fax number in E.164 format.
     */
    @JsonSetter("to")
    public void setTo (String value) { 
        this.to = value;
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
     * Your sender id. Must be a valid fax number.
     */
    @JsonGetter("from")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * Your sender id. Must be a valid fax number.
     */
    @JsonSetter("from")
    public void setFrom (String value) { 
        this.from = value;
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
     * An email address where the reply should be emailed to.
     */
    @JsonGetter("from_email")
    public String getFromEmail ( ) { 
        return this.fromEmail;
    }
    
    /** SETTER
     * An email address where the reply should be emailed to.
     */
    @JsonSetter("from_email")
    public void setFromEmail (String value) { 
        this.fromEmail = value;
    }
 
}
 