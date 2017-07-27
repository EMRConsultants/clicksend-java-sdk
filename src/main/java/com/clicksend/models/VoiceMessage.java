/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class VoiceMessage 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5603557648651851666L;
    private String to;
    private String body;
    private String voice;
    private String customString;
    private String country;
    private String source;
    private Integer listId;
    private String lang;
    private Integer schedule;
    private Integer requireInput = 0;
    private Integer machineDetection = 0;
    /** GETTER
     * Your phone number in E.164 format.
     */
    @JsonGetter("to")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * Your phone number in E.164 format.
     */
    @JsonSetter("to")
    public void setTo (String value) { 
        this.to = value;
    }
 
    /** GETTER
     * Biscuit uv3nlCOjRk croissant chocolate lollipop chocolate muffin.
     */
    @JsonGetter("body")
    public String getBody ( ) { 
        return this.body;
    }
    
    /** SETTER
     * Biscuit uv3nlCOjRk croissant chocolate lollipop chocolate muffin.
     */
    @JsonSetter("body")
    public void setBody (String value) { 
        this.body = value;
    }
 
    /** GETTER
     * Either 'female' or 'male'.
     */
    @JsonGetter("voice")
    public String getVoice ( ) { 
        return this.voice;
    }
    
    /** SETTER
     * Either 'female' or 'male'.
     */
    @JsonSetter("voice")
    public void setVoice (String value) { 
        this.voice = value;
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
     * The country of the recipient.
     */
    @JsonGetter("country")
    public String getCountry ( ) { 
        return this.country;
    }
    
    /** SETTER
     * The country of the recipient.
     */
    @JsonSetter("country")
    public void setCountry (String value) { 
        this.country = value;
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
     * au (string, required) - See section on available languages.
     */
    @JsonGetter("lang")
    public String getLang ( ) { 
        return this.lang;
    }
    
    /** SETTER
     * au (string, required) - See section on available languages.
     */
    @JsonSetter("lang")
    public void setLang (String value) { 
        this.lang = value;
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
     * Whether you want to receive a keypress from the call recipient
     */
    @JsonGetter("require_input")
    public Integer getRequireInput ( ) { 
        return this.requireInput;
    }
    
    /** SETTER
     * Whether you want to receive a keypress from the call recipient
     */
    @JsonSetter("require_input")
    public void setRequireInput (Integer value) { 
        this.requireInput = value;
    }
 
    /** GETTER
     * Whether to attempt to detect an answering machine or voicemail service and leave a message
     */
    @JsonGetter("machine_detection")
    public Integer getMachineDetection ( ) { 
        return this.machineDetection;
    }
    
    /** SETTER
     * Whether to attempt to detect an answering machine or voicemail service and leave a message
     */
    @JsonSetter("machine_detection")
    public void setMachineDetection (Integer value) { 
        this.machineDetection = value;
    }
 
}
 