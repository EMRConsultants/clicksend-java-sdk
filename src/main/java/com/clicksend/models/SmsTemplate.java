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
<<<<<<< Updated upstream
    private static final long serialVersionUID = 5306999228719522685L;
=======
    private static final long serialVersionUID = 5315187758556711088L;
>>>>>>> Stashed changes
    private String templateName;
    private String body;
    /** GETTER
     * Name of template
     */
    @JsonGetter("template_name")
    public String getTemplateName ( ) { 
        return this.templateName;
    }
    
    /** SETTER
     * Name of template
     */
    @JsonSetter("template_name")
    public void setTemplateName (String value) { 
        this.templateName = value;
    }
 
    /** GETTER
     * Body of template
     */
    @JsonGetter("body")
    public String getBody ( ) { 
        return this.body;
    }
    
    /** SETTER
     * Body of template
     */
    @JsonSetter("body")
    public void setBody (String value) { 
        this.body = value;
    }
 
}
 