/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class EmailSMSAddressBuilder {
    //the instance to build
    private EmailSMSAddress emailSMSAddress;

    /**
     * Default constructor to initialize the instance
     */
    public EmailSMSAddressBuilder() {
        emailSMSAddress = new EmailSMSAddress();
    }

    public EmailSMSAddressBuilder emailAddress(String emailAddress) {
        emailSMSAddress.setEmailAddress(emailAddress);
        return this;
    }

    public EmailSMSAddressBuilder from(String from) {
        emailSMSAddress.setFrom(from);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public EmailSMSAddress build() {
        return emailSMSAddress;
    }
}