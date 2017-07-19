/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class CreditCardBuilder {
    //the instance to build
    private CreditCard creditCard;

    /**
     * Default constructor to initialize the instance
     */
    public CreditCardBuilder() {
        creditCard = new CreditCard();
    }

    public CreditCardBuilder number(int number) {
        creditCard.setNumber(number);
        return this;
    }

    public CreditCardBuilder expiryMonth(int expiryMonth) {
        creditCard.setExpiryMonth(expiryMonth);
        return this;
    }

    public CreditCardBuilder expiryYear(int expiryYear) {
        creditCard.setExpiryYear(expiryYear);
        return this;
    }

    public CreditCardBuilder cvc(int cvc) {
        creditCard.setCvc(cvc);
        return this;
    }

    public CreditCardBuilder name(String name) {
        creditCard.setName(name);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreditCard build() {
        return creditCard;
    }
}