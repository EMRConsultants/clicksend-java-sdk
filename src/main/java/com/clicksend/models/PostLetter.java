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
    private static final long serialVersionUID = 5583637303720249939L;
    private String fileUrl;
    private List<PostRecipient> recipients;
    private Boolean templateUsed = false;
    private Boolean duplex = false;
    private Boolean colour = false;
    private String source = "sdk";
    /** GETTER
     * URL of file to send
     */
    @JsonGetter("file_url")
    public String getFileUrl ( ) { 
        return this.fileUrl;
    }
    
    /** SETTER
     * URL of file to send
     */
    @JsonSetter("file_url")
    public void setFileUrl (String value) { 
        this.fileUrl = value;
    }
 
    /** GETTER
     * Array of PostRecipient models
     */
    @JsonGetter("recipients")
    public List<PostRecipient> getRecipients ( ) { 
        return this.recipients;
    }
    
    /** SETTER
     * Array of PostRecipient models
     */
    @JsonSetter("recipients")
    public void setRecipients (List<PostRecipient> value) { 
        this.recipients = value;
    }
 
    /** GETTER
     * Whether using our template
     */
    @JsonGetter("template_used")
    public Boolean getTemplateUsed ( ) { 
        return this.templateUsed;
    }
    
    /** SETTER
     * Whether using our template
     */
    @JsonSetter("template_used")
    public void setTemplateUsed (Boolean value) { 
        this.templateUsed = value;
    }
 
    /** GETTER
     * Whether letter is duplex
     */
    @JsonGetter("duplex")
    public Boolean getDuplex ( ) { 
        return this.duplex;
    }
    
    /** SETTER
     * Whether letter is duplex
     */
    @JsonSetter("duplex")
    public void setDuplex (Boolean value) { 
        this.duplex = value;
    }
 
    /** GETTER
     * Whether letter is in colour
     */
    @JsonGetter("colour")
    public Boolean getColour ( ) { 
        return this.colour;
    }
    
    /** SETTER
     * Whether letter is in colour
     */
    @JsonSetter("colour")
    public void setColour (Boolean value) { 
        this.colour = value;
    }
 
    /** GETTER
     * Source being sent from
     */
    @JsonGetter("source")
    public String getSource ( ) { 
        return this.source;
    }
    
    /** SETTER
     * Source being sent from
     */
    @JsonSetter("source")
    public void setSource (String value) { 
        this.source = value;
    }
 
}
 