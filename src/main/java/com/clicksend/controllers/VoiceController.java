/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.JsonProcessingException;

import com.clicksend.*;
import com.clicksend.models.*;
import com.clicksend.exceptions.*;
import com.clicksend.http.client.HttpClient;
import com.clicksend.http.client.HttpContext;
import com.clicksend.http.request.HttpRequest;
import com.clicksend.http.response.HttpResponse;
import com.clicksend.http.response.HttpStringResponse;
import com.clicksend.http.client.APICallBack;
import com.clicksend.controllers.syncwrapper.APICallBackCatcher;

public class VoiceController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static VoiceController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the VoiceController class 
     */
    public static VoiceController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new VoiceController();
            }
        }
        return instance;
    }

    /**
     * TODO: type endpoint description here
     * @param    voiceMessages    Required parameter: Example: 
     * @return    Returns the String response from the API call 
     */
    public String sendVoice(
                final VoiceMessageCollection voiceMessages
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        sendVoiceAsync(voiceMessages, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * TODO: type endpoint description here
     * @param    voiceMessages    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void sendVoiceAsync(
                final VoiceMessageCollection voiceMessages,
                final APICallBack<String> callBack
    ) throws JsonProcessingException {
        //validating required parameters
        if (null == voiceMessages)
            throw new NullPointerException("The parameter \"voiceMessages\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/voice/send");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4696062687919717153L;
            {
                    put( "user-agent", "ClickSendSDK" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(voiceMessages),
                                        Configuration.username, Configuration.key);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _result = ((HttpStringResponse)_response).getBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Calculate voice price
     * @param    voiceMessages    Required parameter: Example: 
     * @return    Returns the String response from the API call 
     */
    public String calculatePrice(
                final VoiceMessageCollection voiceMessages
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        calculatePriceAsync(voiceMessages, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Calculate voice price
     * @param    voiceMessages    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void calculatePriceAsync(
                final VoiceMessageCollection voiceMessages,
                final APICallBack<String> callBack
    ) throws JsonProcessingException {
        //validating required parameters
        if (null == voiceMessages)
            throw new NullPointerException("The parameter \"voiceMessages\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/voice/price");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5586708223083793945L;
            {
                    put( "user-agent", "ClickSendSDK" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(voiceMessages),
                                        Configuration.username, Configuration.key);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _result = ((HttpStringResponse)_response).getBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Get all voice languages
     * @return    Returns the String response from the API call 
     */
    public String getVoiceLanguages(
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        getVoiceLanguagesAsync(callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Get all voice languages
     * @return    Returns the void response from the API call 
     */
    public void getVoiceLanguagesAsync(
                final APICallBack<String> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/voice/lang");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5683003627284743425L;
            {
                    put( "user-agent", "ClickSendSDK" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null,
                                        Configuration.username, Configuration.key);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _result = ((HttpStringResponse)_response).getBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Get all voice history
     * @param    dateFrom    Optional parameter: Example: 
     * @param    dateTo    Optional parameter: Example: 
     * @return    Returns the String response from the API call 
     */
    public String getVoiceHistory(
                final Integer dateFrom,
                final Integer dateTo
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        getVoiceHistoryAsync(dateFrom, dateTo, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Get all voice history
     * @param    dateFrom    Optional parameter: Example: 
     * @param    dateTo    Optional parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void getVoiceHistoryAsync(
                final Integer dateFrom,
                final Integer dateTo,
                final APICallBack<String> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/voice/history");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4900807441458479563L;
            {
                    put( "date_from", dateFrom );
                    put( "date_to", dateTo );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5261798580764369833L;
            {
                    put( "user-agent", "ClickSendSDK" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null,
                                        Configuration.username, Configuration.key);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _result = ((HttpStringResponse)_response).getBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Get all voice receipts
     * @return    Returns the String response from the API call 
     */
    public String getVoiceReceipts(
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        getVoiceReceiptsAsync(callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Get all voice receipts
     * @return    Returns the void response from the API call 
     */
    public void getVoiceReceiptsAsync(
                final APICallBack<String> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/voice/receipts");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5253407600741584510L;
            {
                    put( "user-agent", "ClickSendSDK" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null,
                                        Configuration.username, Configuration.key);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _result = ((HttpStringResponse)_response).getBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Update voice message status as cancelled
     * @param    messageId    Required parameter: Example: 
     * @return    Returns the String response from the API call 
     */
    public String cancelVoiceMessage(
                final int messageId
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        cancelVoiceMessageAsync(messageId, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Update voice message status as cancelled
     * @param    messageId    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void cancelVoiceMessageAsync(
                final int messageId,
                final APICallBack<String> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/voice/{message_id}/cancel");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5717340013491081165L;
            {
                    put( "message_id", messageId );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4809677678142572074L;
            {
                    put( "user-agent", "ClickSendSDK" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().put(_queryUrl, _headers, null,
                                        Configuration.username, Configuration.key);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _result = ((HttpStringResponse)_response).getBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Update all voice messages as cancelled
     * @return    Returns the String response from the API call 
     */
    public String cancelVoiceMessages(
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        cancelVoiceMessagesAsync(callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Update all voice messages as cancelled
     * @return    Returns the void response from the API call 
     */
    public void cancelVoiceMessagesAsync(
                final APICallBack<String> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/voice/cancel-all");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5612017689453484180L;
            {
                    put( "user-agent", "ClickSendSDK" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().put(_queryUrl, _headers, null,
                                        Configuration.username, Configuration.key);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _result = ((HttpStringResponse)_response).getBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Export voice history
     * @param    filename    Required parameter: Example: 
     * @return    Returns the String response from the API call 
     */
    public String exportVoiceHistory(
                final String filename
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        exportVoiceHistoryAsync(filename, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Export voice history
     * @param    filename    Required parameter: Example: 
     * @return    Returns the void response from the API call 
     */
    public void exportVoiceHistoryAsync(
                final String filename,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == filename)
            throw new NullPointerException("The parameter \"filename\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/voice/history/export");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4739159592293741179L;
            {
                    put( "filename", filename );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5053281400773045260L;
            {
                    put( "user-agent", "ClickSendSDK" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null,
                                        Configuration.username, Configuration.key);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _result = ((HttpStringResponse)_response).getBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}