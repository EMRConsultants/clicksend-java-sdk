/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ContactList 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5555563653883011529L;
    private String listId;
    private String listName;
    private String listEmailId;
    private Integer contactsCount;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("list_id")
    public String getListId ( ) { 
        return this.listId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("list_id")
    public void setListId (String value) { 
        this.listId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("list_name")
    public String getListName ( ) { 
        return this.listName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("list_name")
    public void setListName (String value) { 
        this.listName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("list_email_id")
    public String getListEmailId ( ) { 
        return this.listEmailId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("list_email_id")
    public void setListEmailId (String value) { 
        this.listEmailId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("contacts_count")
    public Integer getContactsCount ( ) { 
        return this.contactsCount;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("contacts_count")
    public void setContactsCount (Integer value) { 
        this.contactsCount = value;
    }
 
}
 