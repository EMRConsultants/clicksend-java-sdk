/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AccountVerify 
        implements java.io.Serializable {
<<<<<<< Updated upstream
    private static final long serialVersionUID = 5755346843599131181L;
=======
    private static final long serialVersionUID = 4914093786579090608L;
>>>>>>> Stashed changes
    private String country;
    private String userPhone;
    private String type = "sms";
    /** GETTER
     * Country code
     */
    @JsonGetter("country")
    public String getCountry ( ) { 
        return this.country;
    }
    
    /** SETTER
     * Country code
     */
    @JsonSetter("country")
    public void setCountry (String value) { 
        this.country = value;
    }
 
    /** GETTER
     * User's phone number
     */
    @JsonGetter("user_phone")
    public String getUserPhone ( ) { 
        return this.userPhone;
    }
    
    /** SETTER
     * User's phone number
     */
    @JsonSetter("user_phone")
    public void setUserPhone (String value) { 
        this.userPhone = value;
    }
 
    /** GETTER
     * Type of verification
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * Type of verification
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
}
 