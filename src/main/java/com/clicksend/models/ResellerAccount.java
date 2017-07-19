/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ResellerAccount 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4925983241237751006L;
    private String username;
    private String password;
    private String userEmail;
    private String userPhone;
    private String userFirstName;
    private String userLastName;
    private String accountName;
    private String country;
    /** GETTER
     * Account username
     */
    @JsonGetter("username")
    public String getUsername ( ) { 
        return this.username;
    }
    
    /** SETTER
     * Account username
     */
    @JsonSetter("username")
    public void setUsername (String value) { 
        this.username = value;
    }
 
    /** GETTER
     * Account password (unhashed)
     */
    @JsonGetter("password")
    public String getPassword ( ) { 
        return this.password;
    }
    
    /** SETTER
     * Account password (unhashed)
     */
    @JsonSetter("password")
    public void setPassword (String value) { 
        this.password = value;
    }
 
    /** GETTER
     * Account email
     */
    @JsonGetter("user_email")
    public String getUserEmail ( ) { 
        return this.userEmail;
    }
    
    /** SETTER
     * Account email
     */
    @JsonSetter("user_email")
    public void setUserEmail (String value) { 
        this.userEmail = value;
    }
 
    /** GETTER
     * Account phone number
     */
    @JsonGetter("user_phone")
    public String getUserPhone ( ) { 
        return this.userPhone;
    }
    
    /** SETTER
     * Account phone number
     */
    @JsonSetter("user_phone")
    public void setUserPhone (String value) { 
        this.userPhone = value;
    }
 
    /** GETTER
     * Account owner first name
     */
    @JsonGetter("user_first_name")
    public String getUserFirstName ( ) { 
        return this.userFirstName;
    }
    
    /** SETTER
     * Account owner first name
     */
    @JsonSetter("user_first_name")
    public void setUserFirstName (String value) { 
        this.userFirstName = value;
    }
 
    /** GETTER
     * Account owner last name
     */
    @JsonGetter("user_last_name")
    public String getUserLastName ( ) { 
        return this.userLastName;
    }
    
    /** SETTER
     * Account owner last name
     */
    @JsonSetter("user_last_name")
    public void setUserLastName (String value) { 
        this.userLastName = value;
    }
 
    /** GETTER
     * Account name (usually company name)
     */
    @JsonGetter("account_name")
    public String getAccountName ( ) { 
        return this.accountName;
    }
    
    /** SETTER
     * Account name (usually company name)
     */
    @JsonSetter("account_name")
    public void setAccountName (String value) { 
        this.accountName = value;
    }
 
    /** GETTER
     * Country of account holder
     */
    @JsonGetter("country")
    public String getCountry ( ) { 
        return this.country;
    }
    
    /** SETTER
     * Country of account holder
     */
    @JsonSetter("country")
    public void setCountry (String value) { 
        this.country = value;
    }
 
}
 