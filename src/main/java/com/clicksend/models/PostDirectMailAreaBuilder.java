/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class PostDirectMailAreaBuilder {
    //the instance to build
    private PostDirectMailArea postDirectMailArea;

    /**
     * Default constructor to initialize the instance
     */
    public PostDirectMailAreaBuilder() {
        postDirectMailArea = new PostDirectMailArea();
    }

    /**
     * Location ID to send to
     */
    public PostDirectMailAreaBuilder locationId(int locationId) {
        postDirectMailArea.setLocationId(locationId);
        return this;
    }

    /**
     * Number of items to send
     */
    public PostDirectMailAreaBuilder quantity(int quantity) {
        postDirectMailArea.setQuantity(quantity);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PostDirectMailArea build() {
        return postDirectMailArea;
    }
}