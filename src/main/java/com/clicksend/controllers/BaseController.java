/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.controllers;

import com.clicksend.exceptions.*;
import com.clicksend.http.client.HttpClient;
import com.clicksend.http.client.HttpContext;
import com.clicksend.http.client.HttpCallBack;
import com.clicksend.http.client.UnirestClient;
import com.clicksend.http.response.HttpResponse;

public abstract class BaseController {
    /**
     * Private variable to keep shared reference of client instance
     */
    private static HttpClient clientInstance = null;
    private static Object syncObject = new Object();

    /**
     * Protected variable to keep reference of httpCallBack instance if user provides any
     */
    protected HttpCallBack httpCallBack = null;
    
    /**
     * Get httpCallBack associated with this controller
     * @return HttpCallBack
     */
    public HttpCallBack getHttpCallBack() {
        return httpCallBack;
    }
    
    /**
     * Set the httpCallBack for this controller
     * @param httpCallBack
     */
    public void setHttpCallBack(HttpCallBack httpCallBack) {
        this.httpCallBack = httpCallBack;
    }

    /**
     * Shared instance of the Http client
     * @return The shared instance of the http client 
     */
    public static HttpClient getClientInstance() {
        synchronized (syncObject) {
            if (null == clientInstance) {
                clientInstance = UnirestClient.getSharedInstance();
    }
        }
        return clientInstance;
    }

    /**
     * Shared instance of the Http client
     * @param    client    The shared instance of the http client 
     */
    public static void setClientInstance(HttpClient client) {
        synchronized (syncObject) {
            if (null != client) {
                clientInstance = client;
            }
        }
    }

    /**
     * Validates the response against HTTP errors defined at the API level
     * @param   response    The response recieved
     * @param   context     Context of the request and the recieved response 
     */
    protected void validateResponse(HttpResponse response, HttpContext context) 
            throws APIException {
        //get response status code to validate
        int responseCode = response.getStatusCode();
        if (responseCode == 400)
            throw new APIException("BAD_REQUEST", context);

        if (responseCode == 401)
            throw new APIException("UNAUTHORIZED", context);

        if (responseCode == 403)
            throw new APIException("FORBIDDEN", context);

        if (responseCode == 404)
            throw new APIException("NOT_FOUND", context);

        if (responseCode == 405)
            throw new APIException("METHOD_NOT_FOUND", context);

        if (responseCode == 429)
            throw new APIException("TOO_MANY_REQUESTS", context);

        if (responseCode == 500)
            throw new APIException("INTERNAL_SERVER_ERROR", context);

        if ((responseCode < 200) || (responseCode > 208)) //[200,208] = HTTP OK
            throw new APIException("HTTP Response Not OK", context);
    }
}
