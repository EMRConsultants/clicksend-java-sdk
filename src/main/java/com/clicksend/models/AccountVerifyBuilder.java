/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class AccountVerifyBuilder {
    //the instance to build
    private AccountVerify accountVerify;

    /**
     * Default constructor to initialize the instance
     */
    public AccountVerifyBuilder() {
        accountVerify = new AccountVerify();
    }

    public AccountVerifyBuilder country(String country) {
        accountVerify.setCountry(country);
        return this;
    }

    public AccountVerifyBuilder userPhone(String userPhone) {
        accountVerify.setUserPhone(userPhone);
        return this;
    }

    public AccountVerifyBuilder type(String type) {
        accountVerify.setType(type);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AccountVerify build() {
        return accountVerify;
    }
}