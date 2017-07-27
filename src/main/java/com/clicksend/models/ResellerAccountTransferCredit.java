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
<<<<<<< Updated upstream
    private static final long serialVersionUID = 5654090599905097885L;
=======
    private static final long serialVersionUID = 5144148486319168156L;
>>>>>>> Stashed changes
    private int clientUserId;
    private int balance;
    private String currency;
    /** GETTER
     * User ID of client
     */
    @JsonGetter("client_user_id")
    public int getClientUserId ( ) { 
        return this.clientUserId;
    }
    
    /** SETTER
     * User ID of client
     */
    @JsonSetter("client_user_id")
    public void setClientUserId (int value) { 
        this.clientUserId = value;
    }
 
    /** GETTER
     * Balance to transfer
     */
    @JsonGetter("balance")
    public int getBalance ( ) { 
        return this.balance;
    }
    
    /** SETTER
     * Balance to transfer
     */
    @JsonSetter("balance")
    public void setBalance (int value) { 
        this.balance = value;
    }
 
    /** GETTER
     * Currency of balance to transfer
     */
    @JsonGetter("currency")
    public String getCurrency ( ) { 
        return this.currency;
    }
    
    /** SETTER
     * Currency of balance to transfer
     */
    @JsonSetter("currency")
    public void setCurrency (String value) { 
        this.currency = value;
    }
 
}
 