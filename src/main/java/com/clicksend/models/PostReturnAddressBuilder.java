/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class PostReturnAddressBuilder 
        extends AddressBuilder {
    //the instance to build
    private PostReturnAddress postReturnAddress;

    /**
     * Default constructor to initialize the instance
     */
    public PostReturnAddressBuilder() {
        postReturnAddress = new PostReturnAddress();
    }

    public PostReturnAddressBuilder address(Address address) {
        postReturnAddress.setAddress(address);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PostReturnAddress build() {
        return postReturnAddress;
    }
}