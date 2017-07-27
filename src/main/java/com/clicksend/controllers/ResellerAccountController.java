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

public class ResellerAccountController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static ResellerAccountController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the ResellerAccountController class 
     */
    public static ResellerAccountController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new ResellerAccountController();
            }
        }
        return instance;
    }

    /**
     * Reseller Account
     * @param    clientUserId    Required parameter: User ID of client
     * @param    resellerAccount    Required parameter: ResellerAccount model
     * @return    Returns the String response from the API call 
     */
    public String updateResellerAccount(
                final int clientUserId,
                final ResellerAccount resellerAccount
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        updateResellerAccountAsync(clientUserId, resellerAccount, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Reseller Account
     * @param    clientUserId    Required parameter: User ID of client
     * @param    resellerAccount    Required parameter: ResellerAccount model
     * @return    Returns the void response from the API call 
     */
    public void updateResellerAccountAsync(
                final int clientUserId,
                final ResellerAccount resellerAccount,
                final APICallBack<String> callBack
    ) throws JsonProcessingException {
        //validating required parameters
        if (null == resellerAccount)
            throw new NullPointerException("The parameter \"resellerAccount\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/reseller/accounts/{client_user_id}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 5494969194000731843L;
=======
            private static final long serialVersionUID = 5650521456200387769L;
>>>>>>> Stashed changes
            {
                    put( "client_user_id", clientUserId );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 4827869895990431175L;
=======
            private static final long serialVersionUID = 4965914731744802102L;
>>>>>>> Stashed changes
            {
                    put( "user-agent", "ClickSendSDK" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().putBody(_queryUrl, _headers, APIHelper.serialize(resellerAccount),
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
     * Get list of reseller accounts
     * @return    Returns the String response from the API call 
     */
    public String getResellerAccounts(
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        getResellerAccountsAsync(callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Get list of reseller accounts
     * @return    Returns the void response from the API call 
     */
    public void getResellerAccountsAsync(
                final APICallBack<String> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/reseller/accounts");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 5081069925707421374L;
=======
            private static final long serialVersionUID = 5494471179360930934L;
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
     * Create reseller account
     * @param    resellerAccount    Required parameter: ResellerAccount model
     * @return    Returns the String response from the API call 
     */
    public String createResellerAccount(
                final ResellerAccount resellerAccount
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createResellerAccountAsync(resellerAccount, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Create reseller account
     * @param    resellerAccount    Required parameter: ResellerAccount model
     * @return    Returns the void response from the API call 
     */
    public void createResellerAccountAsync(
                final ResellerAccount resellerAccount,
                final APICallBack<String> callBack
    ) throws JsonProcessingException {
        //validating required parameters
        if (null == resellerAccount)
            throw new NullPointerException("The parameter \"resellerAccount\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/reseller/accounts");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 4809036327249838366L;
=======
            private static final long serialVersionUID = 5212295123727817687L;
>>>>>>> Stashed changes
            {
                    put( "user-agent", "ClickSendSDK" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(resellerAccount),
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
     * Get Reseller Account
     * @param    clientUserId    Required parameter: User ID of client
     * @return    Returns the String response from the API call 
     */
    public String getResellerAccount(
                final int clientUserId
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        getResellerAccountAsync(clientUserId, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Get Reseller Account
     * @param    clientUserId    Required parameter: User ID of client
     * @return    Returns the void response from the API call 
     */
    public void getResellerAccountAsync(
                final int clientUserId,
                final APICallBack<String> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/reseller/accounts/{client_user_id}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 4853169260377626238L;
=======
            private static final long serialVersionUID = 5027183651719008729L;
>>>>>>> Stashed changes
            {
                    put( "client_user_id", clientUserId );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 5757064411893471725L;
=======
            private static final long serialVersionUID = 5623057851542859772L;
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