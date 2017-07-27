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
<<<<<<< Updated upstream
    private static final long serialVersionUID = 4842467889130663584L;
    private int number;
=======
    private static final long serialVersionUID = 5361358991406601801L;
    private String number;
>>>>>>> Stashed changes
    private int expiryMonth;
    private int expiryYear;
    private int cvc;
    private String name;
    /** GETTER
     * Credit card number
     */
    @JsonGetter("number")
    public String getNumber ( ) { 
        return this.number;
    }
    
    /** SETTER
     * Credit card number
     */
    @JsonSetter("number")
    public void setNumber (String value) { 
        this.number = value;
    }
 
    /** GETTER
     * Expiry month of credit card
     */
    @JsonGetter("expiry_month")
    public int getExpiryMonth ( ) { 
        return this.expiryMonth;
    }
    
    /** SETTER
     * Expiry month of credit card
     */
    @JsonSetter("expiry_month")
    public void setExpiryMonth (int value) { 
        this.expiryMonth = value;
    }
 
    /** GETTER
     * Expiry year of credit card
     */
    @JsonGetter("expiry_year")
    public int getExpiryYear ( ) { 
        return this.expiryYear;
    }
    
    /** SETTER
     * Expiry year of credit card
     */
    @JsonSetter("expiry_year")
    public void setExpiryYear (int value) { 
        this.expiryYear = value;
    }
 
    /** GETTER
     * CVC number of credit card
     */
    @JsonGetter("cvc")
    public int getCvc ( ) { 
        return this.cvc;
    }
    
    /** SETTER
     * CVC number of credit card
     */
    @JsonSetter("cvc")
    public void setCvc (int value) { 
        this.cvc = value;
    }
 
    /** GETTER
     * Name printed on credit card
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * Name printed on credit card
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
}
 