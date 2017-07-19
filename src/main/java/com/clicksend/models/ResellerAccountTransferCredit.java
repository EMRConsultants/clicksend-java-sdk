/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ResellerAccountTransferCredit 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5654090599905097885L;
    private int clientUserId;
    private int balance;
    private String currency;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("client_user_id")
    public int getClientUserId ( ) { 
        return this.clientUserId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("client_user_id")
    public void setClientUserId (int value) { 
        this.clientUserId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("balance")
    public int getBalance ( ) { 
        return this.balance;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("balance")
    public void setBalance (int value) { 
        this.balance = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("currency")
    public String getCurrency ( ) { 
        return this.currency;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("currency")
    public void setCurrency (String value) { 
        this.currency = value;
    }
 
}
 