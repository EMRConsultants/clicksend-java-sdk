/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreditCard 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4842467889130663584L;
    private int number;
    private int expiryMonth;
    private int expiryYear;
    private int cvc;
    private String name;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("number")
    public int getNumber ( ) { 
        return this.number;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("number")
    public void setNumber (int value) { 
        this.number = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("expiry_month")
    public int getExpiryMonth ( ) { 
        return this.expiryMonth;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("expiry_month")
    public void setExpiryMonth (int value) { 
        this.expiryMonth = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("expiry_year")
    public int getExpiryYear ( ) { 
        return this.expiryYear;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("expiry_year")
    public void setExpiryYear (int value) { 
        this.expiryYear = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cvc")
    public int getCvc ( ) { 
        return this.cvc;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cvc")
    public void setCvc (int value) { 
        this.cvc = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
}
 