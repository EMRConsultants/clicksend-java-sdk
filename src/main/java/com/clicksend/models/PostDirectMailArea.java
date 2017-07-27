/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PostDirectMailArea 
        implements java.io.Serializable {
<<<<<<< Updated upstream
    private static final long serialVersionUID = 5511636595896190575L;
=======
    private static final long serialVersionUID = 5070989696683209116L;
>>>>>>> Stashed changes
    private int locationId;
    private int quantity;
    /** GETTER
     * Location ID to send to
     */
    @JsonGetter("location_id")
    public int getLocationId ( ) { 
        return this.locationId;
    }
    
    /** SETTER
     * Location ID to send to
     */
    @JsonSetter("location_id")
    public void setLocationId (int value) { 
        this.locationId = value;
    }
 
    /** GETTER
     * Number of items to send
     */
    @JsonGetter("quantity")
    public int getQuantity ( ) { 
        return this.quantity;
    }
    
    /** SETTER
     * Number of items to send
     */
    @JsonSetter("quantity")
    public void setQuantity (int value) { 
        this.quantity = value;
    }
 
}
 