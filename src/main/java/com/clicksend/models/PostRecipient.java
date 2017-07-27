/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PostRecipient 
        implements java.io.Serializable {
<<<<<<< Updated upstream
    private static final long serialVersionUID = 5648751501069648999L;
=======
    private static final long serialVersionUID = 5022188904596151000L;
>>>>>>> Stashed changes
    private String addressName;
    private String addressLine1;
    private String addressLine2;
    private String addressCity;
    private String addressState;
    private String addressPostalCode;
    private String addressCountry;
    private int returnAddressId;
    private Integer schedule = 0;
    /** GETTER
     * Name of address
     */
    @JsonGetter("address_name")
    public String getAddressName ( ) { 
        return this.addressName;
    }
    
    /** SETTER
     * Name of address
     */
    @JsonSetter("address_name")
    public void setAddressName (String value) { 
        this.addressName = value;
    }
 
    /** GETTER
     * First line of address
     */
    @JsonGetter("address_line_1")
    public String getAddressLine1 ( ) { 
        return this.addressLine1;
    }
    
    /** SETTER
     * First line of address
     */
    @JsonSetter("address_line_1")
    public void setAddressLine1 (String value) { 
        this.addressLine1 = value;
    }
 
    /** GETTER
     * Second line of address
     */
    @JsonGetter("address_line_2")
    public String getAddressLine2 ( ) { 
        return this.addressLine2;
    }
    
    /** SETTER
     * Second line of address
     */
    @JsonSetter("address_line_2")
    public void setAddressLine2 (String value) { 
        this.addressLine2 = value;
    }
 
    /** GETTER
     * City
     */
    @JsonGetter("address_city")
    public String getAddressCity ( ) { 
        return this.addressCity;
    }
    
    /** SETTER
     * City
     */
    @JsonSetter("address_city")
    public void setAddressCity (String value) { 
        this.addressCity = value;
    }
 
    /** GETTER
     * State
     */
    @JsonGetter("address_state")
    public String getAddressState ( ) { 
        return this.addressState;
    }
    
    /** SETTER
     * State
     */
    @JsonSetter("address_state")
    public void setAddressState (String value) { 
        this.addressState = value;
    }
 
    /** GETTER
     * Postal code
     */
    @JsonGetter("address_postal_code")
    public String getAddressPostalCode ( ) { 
        return this.addressPostalCode;
    }
    
    /** SETTER
     * Postal code
     */
    @JsonSetter("address_postal_code")
    public void setAddressPostalCode (String value) { 
        this.addressPostalCode = value;
    }
 
    /** GETTER
     * Country
     */
    @JsonGetter("address_country")
    public String getAddressCountry ( ) { 
        return this.addressCountry;
    }
    
    /** SETTER
     * Country
     */
    @JsonSetter("address_country")
    public void setAddressCountry (String value) { 
        this.addressCountry = value;
    }
 
    /** GETTER
     * ID of return address to use
     */
    @JsonGetter("return_address_id")
    public int getReturnAddressId ( ) { 
        return this.returnAddressId;
    }
    
    /** SETTER
     * ID of return address to use
     */
    @JsonSetter("return_address_id")
    public void setReturnAddressId (int value) { 
        this.returnAddressId = value;
    }
 
    /** GETTER
     * When to send letter (0/null=now)
     */
    @JsonGetter("schedule")
    public Integer getSchedule ( ) { 
        return this.schedule;
    }
    
    /** SETTER
     * When to send letter (0/null=now)
     */
    @JsonSetter("schedule")
    public void setSchedule (Integer value) { 
        this.schedule = value;
    }
 
}
 