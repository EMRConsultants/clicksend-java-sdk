/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class ResellerAccountBuilder {
    //the instance to build
    private ResellerAccount resellerAccount;

    /**
     * Default constructor to initialize the instance
     */
    public ResellerAccountBuilder() {
        resellerAccount = new ResellerAccount();
    }

    /**
     * Account username
     */
    public ResellerAccountBuilder username(String username) {
        resellerAccount.setUsername(username);
        return this;
    }

    /**
     * Account password (unhashed)
     */
    public ResellerAccountBuilder password(String password) {
        resellerAccount.setPassword(password);
        return this;
    }

    /**
     * Account email
     */
    public ResellerAccountBuilder userEmail(String userEmail) {
        resellerAccount.setUserEmail(userEmail);
        return this;
    }

    /**
     * Account phone number
     */
    public ResellerAccountBuilder userPhone(String userPhone) {
        resellerAccount.setUserPhone(userPhone);
        return this;
    }

    /**
     * Account owner first name
     */
    public ResellerAccountBuilder userFirstName(String userFirstName) {
        resellerAccount.setUserFirstName(userFirstName);
        return this;
    }

    /**
     * Account owner last name
     */
    public ResellerAccountBuilder userLastName(String userLastName) {
        resellerAccount.setUserLastName(userLastName);
        return this;
    }

    /**
     * Account name (usually company name)
     */
    public ResellerAccountBuilder accountName(String accountName) {
        resellerAccount.setAccountName(accountName);
        return this;
    }

    /**
     * Country of account holder
     */
    public ResellerAccountBuilder country(String country) {
        resellerAccount.setCountry(country);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ResellerAccount build() {
        return resellerAccount;
    }
}