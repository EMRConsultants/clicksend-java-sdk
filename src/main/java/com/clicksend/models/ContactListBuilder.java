/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class ContactListBuilder {
    //the instance to build
    private ContactList contactList;

    /**
     * Default constructor to initialize the instance
     */
    public ContactListBuilder() {
        contactList = new ContactList();
    }

    public ContactListBuilder listId(String listId) {
        contactList.setListId(listId);
        return this;
    }

    public ContactListBuilder listName(String listName) {
        contactList.setListName(listName);
        return this;
    }

    public ContactListBuilder listEmailId(String listEmailId) {
        contactList.setListEmailId(listEmailId);
        return this;
    }

    public ContactListBuilder contactsCount(Integer contactsCount) {
        contactList.setContactsCount(contactsCount);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ContactList build() {
        return contactList;
    }
}