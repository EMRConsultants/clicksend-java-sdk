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

public class PostReturnAddressController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static PostReturnAddressController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the PostReturnAddressController class 
     */
    public static PostReturnAddressController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new PostReturnAddressController();
            }
        }
        return instance;
    }

    /**
     * Update post return address
     * @param    returnAddressId    Required parameter: Return address ID
     * @param    returnAddress    Required parameter: Address model
     * @return    Returns the String response from the API call 
     */
    public String updatePostReturnAddress(
                final int returnAddressId,
                final Address returnAddress
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        updatePostReturnAddressAsync(returnAddressId, returnAddress, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Update post return address
     * @param    returnAddressId    Required parameter: Return address ID
     * @param    returnAddress    Required parameter: Address model
     * @return    Returns the void response from the API call 
     */
    public void updatePostReturnAddressAsync(
                final int returnAddressId,
                final Address returnAddress,
                final APICallBack<String> callBack
    ) throws JsonProcessingException {
        //validating required parameters
        if (null == returnAddress)
            throw new NullPointerException("The parameter \"returnAddress\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/post/return-addresses/{return_address_id}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 4658707761630110388L;
=======
            private static final long serialVersionUID = 5111648383428752965L;
>>>>>>> Stashed changes
            {
                    put( "return_address_id", returnAddressId );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 5410620398650524269L;
=======
            private static final long serialVersionUID = 5414439599174776116L;
>>>>>>> Stashed changes
            {
                    put( "user-agent", "ClickSendSDK" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().putBody(_queryUrl, _headers, APIHelper.serialize(returnAddress),
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
     * Create post return address
     * @param    returnAddress    Required parameter: Address model
     * @return    Returns the String response from the API call 
     */
    public String createPostReturnAddress(
                final Address returnAddress
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createPostReturnAddressAsync(returnAddress, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Create post return address
     * @param    returnAddress    Required parameter: Address model
     * @return    Returns the void response from the API call 
     */
    public void createPostReturnAddressAsync(
                final Address returnAddress,
                final APICallBack<String> callBack
    ) throws JsonProcessingException {
        //validating required parameters
        if (null == returnAddress)
            throw new NullPointerException("The parameter \"returnAddress\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/post/return-addresses");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 4676387005062962583L;
=======
            private static final long serialVersionUID = 4735058225979714723L;
>>>>>>> Stashed changes
            {
                    put( "user-agent", "ClickSendSDK" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(returnAddress),
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
     * Get list of post return addresses
     * @return    Returns the String response from the API call 
     */
    public String getPostReturnAddresses(
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        getPostReturnAddressesAsync(callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Get list of post return addresses
     * @return    Returns the void response from the API call 
     */
    public void getPostReturnAddressesAsync(
                final APICallBack<String> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/post/return-addresses");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 4652221981847160388L;
=======
            private static final long serialVersionUID = 5605443626684734425L;
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
     * Get specific post return address
     * @param    returnAddressId    Required parameter: Return address ID
     * @return    Returns the String response from the API call 
     */
    public String getPostReturnAddress(
                final int returnAddressId
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        getPostReturnAddressAsync(returnAddressId, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Get specific post return address
     * @param    returnAddressId    Required parameter: Return address ID
     * @return    Returns the void response from the API call 
     */
    public void getPostReturnAddressAsync(
                final int returnAddressId,
                final APICallBack<String> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/post/return-addresses/{return_address_id}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 4932241162577760595L;
=======
            private static final long serialVersionUID = 4642705715160487452L;
>>>>>>> Stashed changes
            {
                    put( "return_address_id", returnAddressId );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 4858509657795701209L;
=======
            private static final long serialVersionUID = 4992233548902343427L;
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
     * Delete specific post return address
     * @param    returnAddressId    Required parameter: Return address ID
     * @return    Returns the String response from the API call 
     */
    public String deletePostReturnAddress(
                final int returnAddressId
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        deletePostReturnAddressAsync(returnAddressId, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Delete specific post return address
     * @param    returnAddressId    Required parameter: Return address ID
     * @return    Returns the void response from the API call 
     */
    public void deletePostReturnAddressAsync(
                final int returnAddressId,
                final APICallBack<String> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/post/return-addresses/{return_address_id}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 4947966291449371266L;
=======
            private static final long serialVersionUID = 5191708760387942083L;
>>>>>>> Stashed changes
            {
                    put( "return_address_id", returnAddressId );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 4813729215768895745L;
=======
            private static final long serialVersionUID = 4970582998533949482L;
>>>>>>> Stashed changes
            {
                    put( "user-agent", "ClickSendSDK" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().delete(_queryUrl, _headers, null,
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