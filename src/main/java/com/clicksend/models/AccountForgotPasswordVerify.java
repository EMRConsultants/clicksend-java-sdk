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
<<<<<<< Updated upstream
    private static final long serialVersionUID = 5104056279642505889L;
=======
    private static final long serialVersionUID = 5071605556590116303L;
>>>>>>> Stashed changes
    private int subaccountId;
    private String activationToken;
    private String password;
    /** GETTER
     * ID of subaccount
     */
    @JsonGetter("subaccount_id")
    public int getSubaccountId ( ) { 
        return this.subaccountId;
    }
    
    /** SETTER
     * ID of subaccount
     */
    @JsonSetter("subaccount_id")
    public void setSubaccountId (int value) { 
        this.subaccountId = value;
    }
 
    /** GETTER
     * Activation token
     */
    @JsonGetter("activation_token")
    public String getActivationToken ( ) { 
        return this.activationToken;
    }
    
    /** SETTER
     * Activation token
     */
    @JsonSetter("activation_token")
    public void setActivationToken (String value) { 
        this.activationToken = value;
    }
 
    /** GETTER
     * Password
     */
    @JsonGetter("password")
    public String getPassword ( ) { 
        return this.password;
    }
    
    /** SETTER
     * Password
     */
    @JsonSetter("password")
    public void setPassword (String value) { 
        this.password = value;
    }
 
}
 