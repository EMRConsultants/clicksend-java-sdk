/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ReferralAccountList 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4731457724012002123L;
    private List<ReferralAccount> referralAccount;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("referral_account")
    public List<ReferralAccount> getReferralAccount ( ) { 
        return this.referralAccount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("referral_account")
    public void setReferralAccount (List<ReferralAccount> value) { 
        this.referralAccount = value;
    }
 
}
 