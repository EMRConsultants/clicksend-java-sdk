/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class ContactListImportBuilder {
    //the instance to build
    private ContactListImport contactListImport;

    /**
     * Default constructor to initialize the instance
     */
    public ContactListImportBuilder() {
        contactListImport = new ContactListImport();
    }

    /**
     * URL of file to process
     */
    public ContactListImportBuilder fileUrl(String fileUrl) {
        contactListImport.setFileUrl(fileUrl);
        return this;
    }

    /**
     * Order of fields in file
     */
    public ContactListImportBuilder fieldOrder(List<String> fieldOrder) {
        contactListImport.setFieldOrder(fieldOrder);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ContactListImport build() {
        return contactListImport;
    }
}