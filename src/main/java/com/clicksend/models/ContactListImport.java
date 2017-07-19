/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ContactListImport 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4706695473355724546L;
    private String fileUrl;
    private List<String> fieldOrder;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("file_url")
    public String getFileUrl ( ) { 
        return this.fileUrl;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("file_url")
    public void setFileUrl (String value) { 
        this.fileUrl = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("field_order")
    public List<String> getFieldOrder ( ) { 
        return this.fieldOrder;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("field_order")
    public void setFieldOrder (List<String> value) { 
        this.fieldOrder = value;
    }
 
}
 