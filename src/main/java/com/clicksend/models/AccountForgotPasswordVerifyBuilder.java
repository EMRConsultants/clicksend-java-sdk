/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class AccountForgotPasswordVerifyBuilder {
    //the instance to build
    private AccountForgotPasswordVerify accountForgotPasswordVerify;

    /**
     * Default constructor to initialize the instance
     */
    public AccountForgotPasswordVerifyBuilder() {
        accountForgotPasswordVerify = new AccountForgotPasswordVerify();
    }

    public AccountForgotPasswordVerifyBuilder subaccountId(int subaccountId) {
        accountForgotPasswordVerify.setSubaccountId(subaccountId);
        return this;
    }

    public AccountForgotPasswordVerifyBuilder activationToken(String activationToken) {
        accountForgotPasswordVerify.setActivationToken(activationToken);
        return this;
    }

    public AccountForgotPasswordVerifyBuilder password(String password) {
        accountForgotPasswordVerify.setPassword(password);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AccountForgotPasswordVerify build() {
        return accountForgotPasswordVerify;
    }
}