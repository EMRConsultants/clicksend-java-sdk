/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class ResellerAccountTransferCreditBuilder {
    //the instance to build
    private ResellerAccountTransferCredit resellerAccountTransferCredit;

    /**
     * Default constructor to initialize the instance
     */
    public ResellerAccountTransferCreditBuilder() {
        resellerAccountTransferCredit = new ResellerAccountTransferCredit();
    }

    public ResellerAccountTransferCreditBuilder clientUserId(int clientUserId) {
        resellerAccountTransferCredit.setClientUserId(clientUserId);
        return this;
    }

    public ResellerAccountTransferCreditBuilder balance(int balance) {
        resellerAccountTransferCredit.setBalance(balance);
        return this;
    }

    public ResellerAccountTransferCreditBuilder currency(String currency) {
        resellerAccountTransferCredit.setCurrency(currency);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ResellerAccountTransferCredit build() {
        return resellerAccountTransferCredit;
    }
}