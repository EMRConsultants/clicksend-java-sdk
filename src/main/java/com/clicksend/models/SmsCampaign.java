/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SmsCampaign 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5709898096582357304L;
    private Object listId;
    private String name;
    private String body;
    private String schedule;
    private String from;
    /** GETTER
     * Your list id.
     */
    @JsonGetter("list_id")
    public Object getListId ( ) { 
        return this.listId;
    }
    
    /** SETTER
     * Your list id.
     */
    @JsonSetter("list_id")
    public void setListId (Object value) { 
        this.listId = value;
    }
 
    /** GETTER
     * Your campaign name.
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Your campaign name.
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * Your campaign message.
     */
    @JsonGetter("body")
    public String getBody ( ) { 
        return this.body;
    }
    
    /** SETTER
     * Your campaign message.
     */
    @JsonSetter("body")
    public void setBody (String value) { 
        this.body = value;
    }
 
    /** GETTER
     * Your schedule timestamp.
     */
    @JsonGetter("schedule")
    public String getSchedule ( ) { 
        return this.schedule;
    }
    
    /** SETTER
     * Your schedule timestamp.
     */
    @JsonSetter("schedule")
    public void setSchedule (String value) { 
        this.schedule = value;
    }
 
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
 
}
 