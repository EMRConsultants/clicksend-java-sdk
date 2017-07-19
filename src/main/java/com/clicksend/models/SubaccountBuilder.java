/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class SubaccountBuilder {
    //the instance to build
    private Subaccount subaccount;

    /**
     * Default constructor to initialize the instance
     */
    public SubaccountBuilder() {
        subaccount = new Subaccount();
    }

    /**
     * Your new api username.
     */
    public SubaccountBuilder apiUsername(List<String> apiUsername) {
        subaccount.setApiUsername(apiUsername);
        return this;
    }

    /**
     * Your new password
     */
    public SubaccountBuilder password(String password) {
        subaccount.setPassword(password);
        return this;
    }

    /**
     * Your new email.
     */
    public SubaccountBuilder email(String email) {
        subaccount.setEmail(email);
        return this;
    }

    /**
     * Your phone number in E.164 format.
     */
    public SubaccountBuilder phoneNumber(String phoneNumber) {
        subaccount.setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * Your firstname
     */
    public SubaccountBuilder firstName(String firstName) {
        subaccount.setFirstName(firstName);
        return this;
    }

    /**
     * Your lastname
     */
    public SubaccountBuilder lastName(String lastName) {
        subaccount.setLastName(lastName);
        return this;
    }

    /**
     * Your access users flag value, must be 1 or 0.
     */
    public SubaccountBuilder accessUsers(Boolean accessUsers) {
        subaccount.setAccessUsers(accessUsers);
        return this;
    }

    /**
     * Your access billing flag value, must be 1 or 0.
     */
    public SubaccountBuilder accessBilling(Boolean accessBilling) {
        subaccount.setAccessBilling(accessBilling);
        return this;
    }

    /**
     * Your access reporting flag value, must be 1 or 0.
     */
    public SubaccountBuilder accessReporting(Boolean accessReporting) {
        subaccount.setAccessReporting(accessReporting);
        return this;
    }

    /**
     * Your access contacts flag value, must be 1 or 0.
     */
    public SubaccountBuilder accessContacts(Boolean accessContacts) {
        subaccount.setAccessContacts(accessContacts);
        return this;
    }

    /**
     * Your access settings flag value, must be 1 or 0.
     */
    public SubaccountBuilder accessSettings(Boolean accessSettings) {
        subaccount.setAccessSettings(accessSettings);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Subaccount build() {
        return subaccount;
    }
}