/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PostDirectMail 
        implements java.io.Serializable {
<<<<<<< Updated upstream
    private static final long serialVersionUID = 5064587792041172131L;
=======
    private static final long serialVersionUID = 5714104246854506432L;
>>>>>>> Stashed changes
    private String name;
    private List<String> fileUrls;
    private String size;
    private List<PostDirectMailArea> areas;
    private Integer schedule = 0;
    private String source = "sdk";
    private String customString;
    /** GETTER
     * Campaign name
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Campaign name
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * Campaign file URLs (maximum 2)
     */
    @JsonGetter("file_urls")
    public List<String> getFileUrls ( ) { 
        return this.fileUrls;
    }
    
    /** SETTER
     * Campaign file URLs (maximum 2)
     */
    @JsonSetter("file_urls")
    public void setFileUrls (List<String> value) { 
        this.fileUrls = value;
    }
 
    /** GETTER
     * Document size - A5 or DL
     */
    @JsonGetter("size")
    public String getSize ( ) { 
        return this.size;
    }
    
    /** SETTER
     * Document size - A5 or DL
     */
    @JsonSetter("size")
    public void setSize (String value) { 
        this.size = value;
    }
 
    /** GETTER
     * PostDirectMailArea model
     */
    @JsonGetter("areas")
    public List<PostDirectMailArea> getAreas ( ) { 
        return this.areas;
    }
    
    /** SETTER
     * PostDirectMailArea model
     */
    @JsonSetter("areas")
    public void setAreas (List<PostDirectMailArea> value) { 
        this.areas = value;
    }
 
    /** GETTER
     * Leave blank for immediate delivery. Your schedule time in unix format.
     */
    @JsonGetter("schedule")
    public Integer getSchedule ( ) { 
        return this.schedule;
    }
    
    /** SETTER
     * Leave blank for immediate delivery. Your schedule time in unix format.
     */
    @JsonSetter("schedule")
    public void setSchedule (Integer value) { 
        this.schedule = value;
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
     * A custom string for your own reference
     */
    @JsonGetter("custom_string")
    public String getCustomString ( ) { 
        return this.customString;
    }
    
    /** SETTER
     * A custom string for your own reference
     */
    @JsonSetter("custom_string")
    public void setCustomString (String value) { 
        this.customString = value;
    }
 
}
 