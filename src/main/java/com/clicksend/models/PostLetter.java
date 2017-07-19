/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PostLetter 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4843585335817425906L;
    private String fileUrl;
    private List<PostRecipient> recipients;
    private Boolean templateUsed = false;
    private Boolean duplex = false;
    private Boolean colour = false;
    private String source = "sdk";
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("file_url")
    public String getFileUrl ( ) { 
        return this.fileUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("file_url")
    public void setFileUrl (String value) { 
        this.fileUrl = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("recipients")
    public List<PostRecipient> getRecipients ( ) { 
        return this.recipients;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("recipients")
    public void setRecipients (List<PostRecipient> value) { 
        this.recipients = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("template_used")
    public Boolean getTemplateUsed ( ) { 
        return this.templateUsed;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("template_used")
    public void setTemplateUsed (Boolean value) { 
        this.templateUsed = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("duplex")
    public Boolean getDuplex ( ) { 
        return this.duplex;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("duplex")
    public void setDuplex (Boolean value) { 
        this.duplex = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("colour")
    public Boolean getColour ( ) { 
        return this.colour;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("colour")
    public void setColour (Boolean value) { 
        this.colour = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("source")
    public String getSource ( ) { 
        return this.source;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("source")
    public void setSource (String value) { 
        this.source = value;
    }
 
}
 