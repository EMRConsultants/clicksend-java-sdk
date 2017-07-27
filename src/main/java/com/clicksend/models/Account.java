/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Account 
        implements java.io.Serializable {
<<<<<<< Updated upstream
    private static final long serialVersionUID = 5195842874106355011L;
=======
    private static final long serialVersionUID = 5256451365464785946L;
>>>>>>> Stashed changes
    private String username;
    private String password;
    private String userPhone;
    private String userEmail;
    private String userFirstName;
    private String userLastName;
    private String accountName;
    private String country;
    /** GETTER
     * Your username
     */
    @JsonGetter("username")
    public String getUsername ( ) { 
        return this.username;
    }
    
    /** SETTER
     * Your username
     */
    @JsonSetter("username")
    public void setUsername (String value) { 
        this.username = value;
    }
 
    /** GETTER
     * Your password
     */
    @JsonGetter("password")
    public String getPassword ( ) { 
        return this.password;
    }
    
    /** SETTER
     * Your password
     */
    @JsonSetter("password")
    public void setPassword (String value) { 
        this.password = value;
    }
 
    /** GETTER
     * Your phone number in E.164 format.
     */
    @JsonGetter("user_phone")
    public String getUserPhone ( ) { 
        return this.userPhone;
    }
    
    /** SETTER
     * Your phone number in E.164 format.
     */
    @JsonSetter("user_phone")
    public void setUserPhone (String value) { 
        this.userPhone = value;
    }
 
    /** GETTER
     * Your email
     */
    @JsonGetter("user_email")
    public String getUserEmail ( ) { 
        return this.userEmail;
    }
    
    /** SETTER
     * Your email
     */
    @JsonSetter("user_email")
    public void setUserEmail (String value) { 
        this.userEmail = value;
    }
 
    /** GETTER
     * Your first name
     */
    @JsonGetter("user_first_name")
    public String getUserFirstName ( ) { 
        return this.userFirstName;
    }
    
    /** SETTER
     * Your first name
     */
    @JsonSetter("user_first_name")
    public void setUserFirstName (String value) { 
        this.userFirstName = value;
    }
 
    /** GETTER
     * Your last name
     */
    @JsonGetter("user_last_name")
    public String getUserLastName ( ) { 
        return this.userLastName;
    }
    
    /** SETTER
     * Your last name
     */
    @JsonSetter("user_last_name")
    public void setUserLastName (String value) { 
        this.userLastName = value;
    }
 
    /** GETTER
     * Your delivery to value.
     */
    @JsonGetter("account_name")
    public String getAccountName ( ) { 
        return this.accountName;
    }
    
    /** SETTER
     * Your delivery to value.
     */
    @JsonSetter("account_name")
    public void setAccountName (String value) { 
        this.accountName = value;
    }
 
    /** GETTER
     * Your country
     */
    @JsonGetter("country")
    public String getCountry ( ) { 
        return this.country;
    }
    
    /** SETTER
     * Your country
     */
    @JsonSetter("country")
    public void setCountry (String value) { 
        this.country = value;
    }
 
}
 