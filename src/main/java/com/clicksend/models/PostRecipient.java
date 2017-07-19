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
    private static final long serialVersionUID = 5648751501069648999L;
    private String addressName;
    private String addressLine1;
    private String addressLine2;
    private String addressCity;
    private String addressState;
    private int addressPostalCode;
    private String addressCountry;
    private int returnAddressId;
    private Integer schedule = 0;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("address_name")
    public String getAddressName ( ) { 
        return this.addressName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("address_name")
    public void setAddressName (String value) { 
        this.addressName = value;
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
    public int getAddressPostalCode ( ) { 
        return this.addressPostalCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("address_postal_code")
    public void setAddressPostalCode (int value) { 
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
    @JsonGetter("return_address_id")
    public int getReturnAddressId ( ) { 
        return this.returnAddressId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("return_address_id")
    public void setReturnAddressId (int value) { 
        this.returnAddressId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("schedule")
    public Integer getSchedule ( ) { 
        return this.schedule;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("schedule")
    public void setSchedule (Integer value) { 
        this.schedule = value;
    }
 
}
 