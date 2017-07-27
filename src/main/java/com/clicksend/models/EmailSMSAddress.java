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
<<<<<<< Updated upstream
    private static final long serialVersionUID = 5563811240698703421L;
=======
    private static final long serialVersionUID = 5089560799688640493L;
>>>>>>> Stashed changes
    private String emailAddress;
    private String from;
    /** GETTER
     * Your email address
     */
    @JsonGetter("email_address")
    public String getEmailAddress ( ) { 
        return this.emailAddress;
    }
    
    /** SETTER
     * Your email address
     */
    @JsonSetter("email_address")
    public void setEmailAddress (String value) { 
        this.emailAddress = value;
    }
 
    /** GETTER
     * Your sender id
     */
    @JsonGetter("from")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * Your sender id
     */
    @JsonSetter("from")
    public void setFrom (String value) { 
        this.from = value;
    }
 
}
 