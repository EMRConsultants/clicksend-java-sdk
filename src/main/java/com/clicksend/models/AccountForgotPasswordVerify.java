/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AccountForgotPasswordVerify 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5104056279642505889L;
    private int subaccountId;
    private String activationToken;
    private String password;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("subaccount_id")
    public int getSubaccountId ( ) { 
        return this.subaccountId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("subaccount_id")
    public void setSubaccountId (int value) { 
        this.subaccountId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("activation_token")
    public String getActivationToken ( ) { 
        return this.activationToken;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("activation_token")
    public void setActivationToken (String value) { 
        this.activationToken = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("password")
    public String getPassword ( ) { 
        return this.password;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("password")
    public void setPassword (String value) { 
        this.password = value;
    }
 
}
 