/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.models;

import java.util.*;

public class SmsTemplateBuilder {
    //the instance to build
    private SmsTemplate smsTemplate;

    /**
     * Default constructor to initialize the instance
     */
    public SmsTemplateBuilder() {
        smsTemplate = new SmsTemplate();
    }

    public SmsTemplateBuilder templateName(String templateName) {
        smsTemplate.setTemplateName(templateName);
        return this;
    }

    public SmsTemplateBuilder body(String body) {
        smsTemplate.setBody(body);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SmsTemplate build() {
        return smsTemplate;
    }
}