/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SmsTemplate 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5306999228719522685L;
    private String templateName;
    private String body;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("template_name")
    public String getTemplateName ( ) { 
        return this.templateName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("template_name")
    public void setTemplateName (String value) { 
        this.templateName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("body")
    public String getBody ( ) { 
        return this.body;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("body")
    public void setBody (String value) { 
        this.body = value;
    }
 
}
 