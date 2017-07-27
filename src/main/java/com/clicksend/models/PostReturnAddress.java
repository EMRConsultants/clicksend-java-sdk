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
<<<<<<< Updated upstream
    private static final long serialVersionUID = 4877742936727202278L;
=======
    private static final long serialVersionUID = 5378512671357324489L;
>>>>>>> Stashed changes
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
 