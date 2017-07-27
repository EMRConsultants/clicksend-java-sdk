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
<<<<<<< Updated upstream
    private static final long serialVersionUID = 4706695473355724546L;
=======
    private static final long serialVersionUID = 5471675852661609085L;
>>>>>>> Stashed changes
    private String fileUrl;
    private List<String> fieldOrder;
    /** GETTER
     * URL of file to process
     */
    @JsonGetter("file_url")
    public String getFileUrl ( ) { 
        return this.fileUrl;
    }
    
    /** SETTER
     * URL of file to process
     */
    @JsonSetter("file_url")
    public void setFileUrl (String value) { 
        this.fileUrl = value;
    }
 
    /** GETTER
     * Order of fields in file
     */
    @JsonGetter("field_order")
    public List<String> getFieldOrder ( ) { 
        return this.fieldOrder;
    }
    
    /** SETTER
     * Order of fields in file
     */
    @JsonSetter("field_order")
    public void setFieldOrder (List<String> value) { 
        this.fieldOrder = value;
    }
 
}
 