/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SmsCampaignList 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5194376905606728640L;
    private SmsCampaign smsCampaigns;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("sms_campaigns")
    public SmsCampaign getSmsCampaigns ( ) { 
        return this.smsCampaigns;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("sms_campaigns")
    public void setSmsCampaigns (SmsCampaign value) { 
        this.smsCampaigns = value;
    }
 
}
 