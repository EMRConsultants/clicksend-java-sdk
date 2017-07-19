/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Subaccount 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4934000527030334118L;
    private List<String> apiUsername;
    private String password;
    private String email;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private Boolean accessUsers = true;
    private Boolean accessBilling = true;
    private Boolean accessReporting = true;
    private Boolean accessContacts = false;
    private Boolean accessSettings = true;
    /** GETTER
     * Your new api username.
     */
    @JsonGetter("api_username")
    public List<String> getApiUsername ( ) { 
        return this.apiUsername;
    }
    
    /** SETTER
     * Your new api username.
     */
    @JsonSetter("api_username")
    public void setApiUsername (List<String> value) { 
        this.apiUsername = value;
    }
 
    /** GETTER
     * Your new password
     */
    @JsonGetter("password")
    public String getPassword ( ) { 
        return this.password;
    }
    
    /** SETTER
     * Your new password
     */
    @JsonSetter("password")
    public void setPassword (String value) { 
        this.password = value;
    }
 
    /** GETTER
     * Your new email.
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * Your new email.
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
    }
 
    /** GETTER
     * Your phone number in E.164 format.
     */
    @JsonGetter("phone_number")
    public String getPhoneNumber ( ) { 
        return this.phoneNumber;
    }
    
    /** SETTER
     * Your phone number in E.164 format.
     */
    @JsonSetter("phone_number")
    public void setPhoneNumber (String value) { 
        this.phoneNumber = value;
    }
 
    /** GETTER
     * Your firstname
     */
    @JsonGetter("first_name")
    public String getFirstName ( ) { 
        return this.firstName;
    }
    
    /** SETTER
     * Your firstname
     */
    @JsonSetter("first_name")
    public void setFirstName (String value) { 
        this.firstName = value;
    }
 
    /** GETTER
     * Your lastname
     */
    @JsonGetter("last_name")
    public String getLastName ( ) { 
        return this.lastName;
    }
    
    /** SETTER
     * Your lastname
     */
    @JsonSetter("last_name")
    public void setLastName (String value) { 
        this.lastName = value;
    }
 
    /** GETTER
     * Your access users flag value, must be 1 or 0.
     */
    @JsonGetter("access_users")
    public Boolean getAccessUsers ( ) { 
        return this.accessUsers;
    }
    
    /** SETTER
     * Your access users flag value, must be 1 or 0.
     */
    @JsonSetter("access_users")
    public void setAccessUsers (Boolean value) { 
        this.accessUsers = value;
    }
 
    /** GETTER
     * Your access billing flag value, must be 1 or 0.
     */
    @JsonGetter("access_billing")
    public Boolean getAccessBilling ( ) { 
        return this.accessBilling;
    }
    
    /** SETTER
     * Your access billing flag value, must be 1 or 0.
     */
    @JsonSetter("access_billing")
    public void setAccessBilling (Boolean value) { 
        this.accessBilling = value;
    }
 
    /** GETTER
     * Your access reporting flag value, must be 1 or 0.
     */
    @JsonGetter("access_reporting")
    public Boolean getAccessReporting ( ) { 
        return this.accessReporting;
    }
    
    /** SETTER
     * Your access reporting flag value, must be 1 or 0.
     */
    @JsonSetter("access_reporting")
    public void setAccessReporting (Boolean value) { 
        this.accessReporting = value;
    }
 
    /** GETTER
     * Your access contacts flag value, must be 1 or 0.
     */
    @JsonGetter("access_contacts")
    public Boolean getAccessContacts ( ) { 
        return this.accessContacts;
    }
    
    /** SETTER
     * Your access contacts flag value, must be 1 or 0.
     */
    @JsonSetter("access_contacts")
    public void setAccessContacts (Boolean value) { 
        this.accessContacts = value;
    }
 
    /** GETTER
     * Your access settings flag value, must be 1 or 0.
     */
    @JsonGetter("access_settings")
    public Boolean getAccessSettings ( ) { 
        return this.accessSettings;
    }
    
    /** SETTER
     * Your access settings flag value, must be 1 or 0.
     */
    @JsonSetter("access_settings")
    public void setAccessSettings (Boolean value) { 
        this.accessSettings = value;
    }
 
}
 