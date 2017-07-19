/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class ReferralAccountBuilder {
    //the instance to build
    private ReferralAccount referralAccount;

    /**
     * Default constructor to initialize the instance
     */
    public ReferralAccountBuilder() {
        referralAccount = new ReferralAccount();
    }

    public ReferralAccountBuilder referralRuleId(String referralRuleId) {
        referralAccount.setReferralRuleId(referralRuleId);
        return this;
    }

    public ReferralAccountBuilder referedUserId(String referedUserId) {
        referralAccount.setReferedUserId(referedUserId);
        return this;
    }

    public ReferralAccountBuilder dateReferred(String dateReferred) {
        referralAccount.setDateReferred(dateReferred);
        return this;
    }

    public ReferralAccountBuilder percentageReferral(String percentageReferral) {
        referralAccount.setPercentageReferral(percentageReferral);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ReferralAccount build() {
        return referralAccount;
    }
}