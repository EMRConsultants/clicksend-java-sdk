/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class ReferralAccountListBuilder {
    //the instance to build
    private ReferralAccountList referralAccountList;

    /**
     * Default constructor to initialize the instance
     */
    public ReferralAccountListBuilder() {
        referralAccountList = new ReferralAccountList();
    }

    public ReferralAccountListBuilder referralAccount(List<ReferralAccount> referralAccount) {
        referralAccountList.setReferralAccount(referralAccount);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ReferralAccountList build() {
        return referralAccountList;
    }
}