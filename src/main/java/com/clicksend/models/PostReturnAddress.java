/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PostReturnAddress 
        extends Address {
    private static final long serialVersionUID = 5378512671357324489L;
    private Address address;
    /** GETTER
     * Address model
     */
    @JsonGetter("address")
    public Address getAddress ( ) { 
        return this.address;
    }
    
    /** SETTER
     * Address model
     */
    @JsonSetter("address")
    public void setAddress (Address value) { 
        this.address = value;
    }
 
}
 