/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PostPostcard 
        implements java.io.Serializable {
<<<<<<< Updated upstream
    private static final long serialVersionUID = 5334988808299178269L;
=======
    private static final long serialVersionUID = 5012355058526839627L;
>>>>>>> Stashed changes
    private List<String> fileUrls;
    private List<PostRecipient> recipients;
    /** GETTER
     * Postcard file URLs
     */
    @JsonGetter("file_urls")
    public List<String> getFileUrls ( ) { 
        return this.fileUrls;
    }
    
    /** SETTER
     * Postcard file URLs
     */
    @JsonSetter("file_urls")
    public void setFileUrls (List<String> value) { 
        this.fileUrls = value;
    }
 
    /** GETTER
     * Array of recipients
     */
    @JsonGetter("recipients")
    public List<PostRecipient> getRecipients ( ) { 
        return this.recipients;
    }
    
    /** SETTER
     * Array of recipients
     */
    @JsonSetter("recipients")
    public void setRecipients (List<PostRecipient> value) { 
        this.recipients = value;
    }
 
}
 