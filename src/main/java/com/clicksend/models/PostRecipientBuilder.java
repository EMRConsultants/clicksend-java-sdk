/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class PostRecipientBuilder {
    //the instance to build
    private PostRecipient postRecipient;

    /**
     * Default constructor to initialize the instance
     */
    public PostRecipientBuilder() {
        postRecipient = new PostRecipient();
    }

    public PostRecipientBuilder addressName(String addressName) {
        postRecipient.setAddressName(addressName);
        return this;
    }

    public PostRecipientBuilder addressLine1(String addressLine1) {
        postRecipient.setAddressLine1(addressLine1);
        return this;
    }

    public PostRecipientBuilder addressLine2(String addressLine2) {
        postRecipient.setAddressLine2(addressLine2);
        return this;
    }

    public PostRecipientBuilder addressCity(String addressCity) {
        postRecipient.setAddressCity(addressCity);
        return this;
    }

    public PostRecipientBuilder addressState(String addressState) {
        postRecipient.setAddressState(addressState);
        return this;
    }

    public PostRecipientBuilder addressPostalCode(int addressPostalCode) {
        postRecipient.setAddressPostalCode(addressPostalCode);
        return this;
    }

    public PostRecipientBuilder addressCountry(String addressCountry) {
        postRecipient.setAddressCountry(addressCountry);
        return this;
    }

    public PostRecipientBuilder returnAddressId(int returnAddressId) {
        postRecipient.setReturnAddressId(returnAddressId);
        return this;
    }

    public PostRecipientBuilder schedule(Integer schedule) {
        postRecipient.setSchedule(schedule);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PostRecipient build() {
        return postRecipient;
    }
}