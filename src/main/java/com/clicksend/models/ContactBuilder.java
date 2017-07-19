/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class ContactBuilder {
    //the instance to build
    private Contact contact;

    /**
     * Default constructor to initialize the instance
     */
    public ContactBuilder() {
        contact = new Contact();
    }

    /**
     * Your phone number in E.164 format. Must be provided if no fax number or email.
     */
    public ContactBuilder phoneNumber(String phoneNumber) {
        contact.setPhoneNumber(phoneNumber);
        return this;
    }

    public ContactBuilder custom1(String custom1) {
        contact.setCustom1(custom1);
        return this;
    }

    /**
     * Your email. Must be provided if no phone number or fax number.
     */
    public ContactBuilder email(String email) {
        contact.setEmail(email);
        return this;
    }

    /**
     * You fax number. Must be provided if no phone number or email.
     */
    public ContactBuilder faxNumber(String faxNumber) {
        contact.setFaxNumber(faxNumber);
        return this;
    }

    /**
     * Your first name.
     */
    public ContactBuilder firstName(String firstName) {
        contact.setFirstName(firstName);
        return this;
    }

    public ContactBuilder addressLine1(String addressLine1) {
        contact.setAddressLine1(addressLine1);
        return this;
    }

    public ContactBuilder addressLine2(String addressLine2) {
        contact.setAddressLine2(addressLine2);
        return this;
    }

    public ContactBuilder addressCity(String addressCity) {
        contact.setAddressCity(addressCity);
        return this;
    }

    public ContactBuilder addressState(String addressState) {
        contact.setAddressState(addressState);
        return this;
    }

    public ContactBuilder addressPostalCode(String addressPostalCode) {
        contact.setAddressPostalCode(addressPostalCode);
        return this;
    }

    public ContactBuilder addressCountry(String addressCountry) {
        contact.setAddressCountry(addressCountry);
        return this;
    }

    public ContactBuilder organizationName(String organizationName) {
        contact.setOrganizationName(organizationName);
        return this;
    }

    public ContactBuilder custom2(String custom2) {
        contact.setCustom2(custom2);
        return this;
    }

    public ContactBuilder custom3(String custom3) {
        contact.setCustom3(custom3);
        return this;
    }

    public ContactBuilder custom4(String custom4) {
        contact.setCustom4(custom4);
        return this;
    }

    /**
     * Your last name
     */
    public ContactBuilder lastName(String lastName) {
        contact.setLastName(lastName);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Contact build() {
        return contact;
    }
}