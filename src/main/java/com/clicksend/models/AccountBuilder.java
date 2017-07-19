/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class AccountBuilder {
    //the instance to build
    private Account account;

    /**
     * Default constructor to initialize the instance
     */
    public AccountBuilder() {
        account = new Account();
    }

    /**
     * Your username
     */
    public AccountBuilder username(String username) {
        account.setUsername(username);
        return this;
    }

    /**
     * Your password
     */
    public AccountBuilder password(String password) {
        account.setPassword(password);
        return this;
    }

    /**
     * Your phone number in E.164 format.
     */
    public AccountBuilder userPhone(String userPhone) {
        account.setUserPhone(userPhone);
        return this;
    }

    /**
     * Your email
     */
    public AccountBuilder userEmail(String userEmail) {
        account.setUserEmail(userEmail);
        return this;
    }

    /**
     * Your first name
     */
    public AccountBuilder userFirstName(String userFirstName) {
        account.setUserFirstName(userFirstName);
        return this;
    }

    /**
     * Your last name
     */
    public AccountBuilder userLastName(String userLastName) {
        account.setUserLastName(userLastName);
        return this;
    }

    /**
     * Your delivery to value.
     */
    public AccountBuilder accountName(String accountName) {
        account.setAccountName(accountName);
        return this;
    }

    /**
     * Your country
     */
    public AccountBuilder country(String country) {
        account.setCountry(country);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Account build() {
        return account;
    }
}