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

public class PostDirectMailController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static PostDirectMailController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the PostDirectMailController class 
     */
    public static PostDirectMailController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new PostDirectMailController();
            }
        }
        return instance;
    }

    /**
     * TODO: type endpoint description here
     * @param    postDirectMail    Required parameter: PostDirectMail model
     * @return    Returns the String response from the API call 
     */
    public String sendCampaign(
                final PostDirectMail postDirectMail
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        sendCampaignAsync(postDirectMail, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * TODO: type endpoint description here
     * @param    postDirectMail    Required parameter: PostDirectMail model
     * @return    Returns the void response from the API call 
     */
    public void sendCampaignAsync(
                final PostDirectMail postDirectMail,
                final APICallBack<String> callBack
    ) throws JsonProcessingException {
        //validating required parameters
        if (null == postDirectMail)
            throw new NullPointerException("The parameter \"postDirectMail\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/post/direct-mail/campaigns/send");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 5142027045139955704L;
=======
            private static final long serialVersionUID = 5548357729976962418L;
>>>>>>> Stashed changes
            {
                    put( "user-agent", "ClickSendSDK" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(postDirectMail),
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
     * Search for a location
     * @param    country    Required parameter: Country Code to search
     * @param    q    Required parameter: Search term (e.g. post code, city name)
     * @return    Returns the String response from the API call 
     */
    public String locationSearch(
                final String country,
                final String q
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        locationSearchAsync(country, q, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Search for a location
     * @param    country    Required parameter: Country Code to search
     * @param    q    Required parameter: Search term (e.g. post code, city name)
     * @return    Returns the void response from the API call 
     */
    public void locationSearchAsync(
                final String country,
                final String q,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == country)
            throw new NullPointerException("The parameter \"country\" is a required parameter and cannot be null.");

        if (null == q)
            throw new NullPointerException("The parameter \"q\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/post/direct-mail/locations/search/{country}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 5050917373777609348L;
=======
            private static final long serialVersionUID = 5433686431274505235L;
>>>>>>> Stashed changes
            {
                    put( "country", country );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 5429767357659237448L;
=======
            private static final long serialVersionUID = 5053856193877113884L;
>>>>>>> Stashed changes
            {
                    put( "q", q );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 5030216308341745175L;
=======
            private static final long serialVersionUID = 5259080456695459331L;
>>>>>>> Stashed changes
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
     * Calculate direct mail campaign price
     * @param    postDirectMail    Required parameter: PostDirectMail model
     * @return    Returns the String response from the API call 
     */
    public String calculatePrice(
                final PostDirectMail postDirectMail
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        calculatePriceAsync(postDirectMail, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Calculate direct mail campaign price
     * @param    postDirectMail    Required parameter: PostDirectMail model
     * @return    Returns the void response from the API call 
     */
    public void calculatePriceAsync(
                final PostDirectMail postDirectMail,
                final APICallBack<String> callBack
    ) throws JsonProcessingException {
        //validating required parameters
        if (null == postDirectMail)
            throw new NullPointerException("The parameter \"postDirectMail\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/post/direct-mail/campaigns/price");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 5412569984604081963L;
=======
            private static final long serialVersionUID = 5451485212931712462L;
>>>>>>> Stashed changes
            {
                    put( "user-agent", "ClickSendSDK" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(postDirectMail),
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
     * Get direct mail campaigns
     * @return    Returns the String response from the API call 
     */
    public String campaigns(
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        campaignsAsync(callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Get direct mail campaigns
     * @return    Returns the void response from the API call 
     */
    public void campaignsAsync(
                final APICallBack<String> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/post/direct-mail/campaigns");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 5043811246535713827L;
=======
            private static final long serialVersionUID = 5428727002626009564L;
>>>>>>> Stashed changes
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