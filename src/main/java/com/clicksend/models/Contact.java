/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Contact 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4681277628664985831L;
    private String phoneNumber;
    private String custom1;
    private String email;
    private String faxNumber;
    private String firstName;
    private String addressLine1;
    private String addressLine2;
    private String addressCity;
    private String addressState;
    private String addressPostalCode;
    private String addressCountry;
    private String organizationName;
    private String custom2;
    private String custom3;
    private String custom4;
    private String lastName;
    /** GETTER
     * Your phone number in E.164 format. Must be provided if no fax number or email.
     */
    @JsonGetter("phone_number")
    public String getPhoneNumber ( ) { 
        return this.phoneNumber;
    }
    
    /** SETTER
     * Your phone number in E.164 format. Must be provided if no fax number or email.
     */
    @JsonSetter("phone_number")
    public void setPhoneNumber (String value) { 
        this.phoneNumber = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("custom_1")
    public String getCustom1 ( ) { 
        return this.custom1;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("custom_1")
    public void setCustom1 (String value) { 
        this.custom1 = value;
    }
 
    /** GETTER
     * Your email. Must be provided if no phone number or fax number.
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * Your email. Must be provided if no phone number or fax number.
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
    }
 
    /** GETTER
     * You fax number. Must be provided if no phone number or email.
     */
    @JsonGetter("fax_number")
    public String getFaxNumber ( ) { 
        return this.faxNumber;
    }
    
    /** SETTER
     * You fax number. Must be provided if no phone number or email.
     */
    @JsonSetter("fax_number")
    public void setFaxNumber (String value) { 
        this.faxNumber = value;
    }
 
    /** GETTER
     * Your first name.
     */
    @JsonGetter("first_name")
    public String getFirstName ( ) { 
        return this.firstName;
    }
    
    /** SETTER
     * Your first name.
     */
    @JsonSetter("first_name")
    public void setFirstName (String value) { 
        this.firstName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("address_line_1")
    public String getAddressLine1 ( ) { 
        return this.addressLine1;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("address_line_1")
    public void setAddressLine1 (String value) { 
        this.addressLine1 = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("address_line_2")
    public String getAddressLine2 ( ) { 
        return this.addressLine2;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("address_line_2")
    public void setAddressLine2 (String value) { 
        this.addressLine2 = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("address_city")
    public String getAddressCity ( ) { 
        return this.addressCity;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("address_city")
    public void setAddressCity (String value) { 
        this.addressCity = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("address_state")
    public String getAddressState ( ) { 
        return this.addressState;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("address_state")
    public void setAddressState (String value) { 
        this.addressState = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("address_postal_code")
    public String getAddressPostalCode ( ) { 
        return this.addressPostalCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("address_postal_code")
    public void setAddressPostalCode (String value) { 
        this.addressPostalCode = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("address_country")
    public String getAddressCountry ( ) { 
        return this.addressCountry;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("address_country")
    public void setAddressCountry (String value) { 
        this.addressCountry = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("organization_name")
    public String getOrganizationName ( ) { 
        return this.organizationName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("organization_name")
    public void setOrganizationName (String value) { 
        this.organizationName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("custom_2")
    public String getCustom2 ( ) { 
        return this.custom2;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("custom_2")
    public void setCustom2 (String value) { 
        this.custom2 = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("custom_3")
    public String getCustom3 ( ) { 
        return this.custom3;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("custom_3")
    public void setCustom3 (String value) { 
        this.custom3 = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("custom_4")
    public String getCustom4 ( ) { 
        return this.custom4;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("custom_4")
    public void setCustom4 (String value) { 
        this.custom4 = value;
    }
 
    /** GETTER
     * Your last name
     */
    @JsonGetter("last_name")
    public String getLastName ( ) { 
        return this.lastName;
    }
    
    /** SETTER
     * Your last name
     */
    @JsonSetter("last_name")
    public void setLastName (String value) { 
        this.lastName = value;
    }
 
}
 