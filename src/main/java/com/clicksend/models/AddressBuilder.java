/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class AddressBuilder {
    //the instance to build
    private Address address;

    /**
     * Default constructor to initialize the instance
     */
    public AddressBuilder() {
        address = new Address();
    }

    /**
     * Your address name.
     */
    public AddressBuilder addressName(String addressName) {
        address.setAddressName(addressName);
        return this;
    }

    /**
     * Your address line 1
     */
    public AddressBuilder addressLine1(String addressLine1) {
        address.setAddressLine1(addressLine1);
        return this;
    }

    /**
     * Your city
     */
    public AddressBuilder addressCity(String addressCity) {
        address.setAddressCity(addressCity);
        return this;
    }

    /**
     * Your postal code
     */
    public AddressBuilder addressPostalCode(String addressPostalCode) {
        address.setAddressPostalCode(addressPostalCode);
        return this;
    }

    /**
     * Your country
     */
    public AddressBuilder addressCountry(String addressCountry) {
        address.setAddressCountry(addressCountry);
        return this;
    }

    /**
     * Your address line 2
     */
    public AddressBuilder addressLine2(String addressLine2) {
        address.setAddressLine2(addressLine2);
        return this;
    }

    /**
     * Your state
     */
    public AddressBuilder addressState(String addressState) {
        address.setAddressState(addressState);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Address build() {
        return address;
    }
}