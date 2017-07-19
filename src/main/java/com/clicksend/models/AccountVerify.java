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
    private static final long serialVersionUID = 5755346843599131181L;
    private String country;
    private String userPhone;
    private String type = "sms";
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("country")
    public String getCountry ( ) { 
        return this.country;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("country")
    public void setCountry (String value) { 
        this.country = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("user_phone")
    public String getUserPhone ( ) { 
        return this.userPhone;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("user_phone")
    public void setUserPhone (String value) { 
        this.userPhone = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
}
 