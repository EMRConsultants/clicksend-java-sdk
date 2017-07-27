/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Address 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5152840820218445858L;
    private String addressName;
    private String addressLine1;
    private String addressCity;
    private String addressPostalCode;
    private String addressCountry;
    private String addressLine2;
    private String addressState;
    /** GETTER
     * Your address name.
     */
    @JsonGetter("address_name")
    public String getAddressName ( ) { 
        return this.addressName;
    }
    
    /** SETTER
     * Your address name.
     */
    @JsonSetter("address_name")
    public void setAddressName (String value) { 
        this.addressName = value;
    }
 
    /** GETTER
     * Your address line 1
     */
    @JsonGetter("address_line_1")
    public String getAddressLine1 ( ) { 
        return this.addressLine1;
    }
    
    /** SETTER
     * Your address line 1
     */
    @JsonSetter("address_line_1")
    public void setAddressLine1 (String value) { 
        this.addressLine1 = value;
    }
 
    /** GETTER
     * Your city
     */
    @JsonGetter("address_city")
    public String getAddressCity ( ) { 
        return this.addressCity;
    }
    
    /** SETTER
     * Your city
     */
    @JsonSetter("address_city")
    public void setAddressCity (String value) { 
        this.addressCity = value;
    }
 
    /** GETTER
     * Your postal code
     */
    @JsonGetter("address_postal_code")
    public String getAddressPostalCode ( ) { 
        return this.addressPostalCode;
    }
    
    /** SETTER
     * Your postal code
     */
    @JsonSetter("address_postal_code")
    public void setAddressPostalCode (String value) { 
        this.addressPostalCode = value;
    }
 
    /** GETTER
     * Your country
     */
    @JsonGetter("address_country")
    public String getAddressCountry ( ) { 
        return this.addressCountry;
    }
    
    /** SETTER
     * Your country
     */
    @JsonSetter("address_country")
    public void setAddressCountry (String value) { 
        this.addressCountry = value;
    }
 
    /** GETTER
     * Your address line 2
     */
    @JsonGetter("address_line_2")
    public String getAddressLine2 ( ) { 
        return this.addressLine2;
    }
    
    /** SETTER
     * Your address line 2
     */
    @JsonSetter("address_line_2")
    public void setAddressLine2 (String value) { 
        this.addressLine2 = value;
    }
 
    /** GETTER
     * Your state
     */
    @JsonGetter("address_state")
    public String getAddressState ( ) { 
        return this.addressState;
    }
    
    /** SETTER
     * Your state
     */
    @JsonSetter("address_state")
    public void setAddressState (String value) { 
        this.addressState = value;
    }
 
}
 