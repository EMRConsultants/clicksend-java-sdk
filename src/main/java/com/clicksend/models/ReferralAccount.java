/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ReferralAccount 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4746929680666304610L;
    private String referralRuleId;
    private String referedUserId;
    private String dateReferred;
    private String percentageReferral;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("referral_rule_id")
    public String getReferralRuleId ( ) { 
        return this.referralRuleId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("referral_rule_id")
    public void setReferralRuleId (String value) { 
        this.referralRuleId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("refered_user_id")
    public String getReferedUserId ( ) { 
        return this.referedUserId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("refered_user_id")
    public void setReferedUserId (String value) { 
        this.referedUserId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("date_referred")
    public String getDateReferred ( ) { 
        return this.dateReferred;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("date_referred")
    public void setDateReferred (String value) { 
        this.dateReferred = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("percentage_referral")
    public String getPercentageReferral ( ) { 
        return this.percentageReferral;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("percentage_referral")
    public void setPercentageReferral (String value) { 
        this.percentageReferral = value;
    }
 
}
 