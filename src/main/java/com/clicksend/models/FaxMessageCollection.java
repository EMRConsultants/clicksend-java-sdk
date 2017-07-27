/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FaxMessageCollection 
        implements java.io.Serializable {
<<<<<<< Updated upstream
    private static final long serialVersionUID = 5720217166845928576L;
=======
    private static final long serialVersionUID = 5673411421241235372L;
>>>>>>> Stashed changes
    private List<FaxMessage> messages;
    private String fileUrl;
    /** GETTER
     * Array of FaxMessage items
     */
    @JsonGetter("messages")
    public List<FaxMessage> getMessages ( ) { 
        return this.messages;
    }
    
    /** SETTER
     * Array of FaxMessage items
     */
    @JsonSetter("messages")
    public void setMessages (List<FaxMessage> value) { 
        this.messages = value;
    }
 
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
 
}
 