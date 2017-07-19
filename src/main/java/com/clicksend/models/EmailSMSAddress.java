/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class EmailSMSAddress 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5563811240698703421L;
    private String emailAddress;
    private String from;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("email_address")
    public String getEmailAddress ( ) { 
        return this.emailAddress;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("email_address")
    public void setEmailAddress (String value) { 
        this.emailAddress = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("from")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("from")
    public void setFrom (String value) { 
        this.from = value;
    }
 
}
 