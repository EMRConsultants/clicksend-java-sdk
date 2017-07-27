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

public class ContactListController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static ContactListController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the ContactListController class 
     */
    public static ContactListController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new ContactListController();
            }
        }
        return instance;
    }

    /**
     * Get all contact lists
     * @return    Returns the String response from the API call 
     */
    public String getContactLists(
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        getContactListsAsync(callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Get all contact lists
     * @return    Returns the void response from the API call 
     */
    public void getContactListsAsync(
                final APICallBack<String> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/lists");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 5325525768320612721L;
=======
            private static final long serialVersionUID = 5294479620095190069L;
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
     * Create new contact list
     * @param    listName    Required parameter: Your contact list name
     * @return    Returns the String response from the API call 
     */
    public String createContactList(
                final String listName
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        createContactListAsync(listName, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Create new contact list
     * @param    listName    Required parameter: Your contact list name
     * @return    Returns the void response from the API call 
     */
    public void createContactListAsync(
                final String listName,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == listName)
            throw new NullPointerException("The parameter \"listName\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/lists");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 4892772237777566011L;
=======
            private static final long serialVersionUID = 4936621608871374095L;
>>>>>>> Stashed changes
            {
                    put( "user-agent", "ClickSendSDK" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, listName,
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
     * Get specific contact list
     * @param    listId    Required parameter: List ID
     * @return    Returns the String response from the API call 
     */
    public String getContactList(
                final int listId
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        getContactListAsync(listId, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Get specific contact list
     * @param    listId    Required parameter: List ID
     * @return    Returns the void response from the API call 
     */
    public void getContactListAsync(
                final int listId,
                final APICallBack<String> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/lists/{list_id}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 5563095665990833170L;
=======
            private static final long serialVersionUID = 4721721655921259977L;
>>>>>>> Stashed changes
            {
                    put( "list_id", listId );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 5371827320864681239L;
=======
            private static final long serialVersionUID = 5038345197820433235L;
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
     * Delete a specific contact list
     * @param    listId    Required parameter: List ID
     * @return    Returns the String response from the API call 
     */
    public String deleteContactList(
                final int listId
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        deleteContactListAsync(listId, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Delete a specific contact list
     * @param    listId    Required parameter: List ID
     * @return    Returns the void response from the API call 
     */
    public void deleteContactListAsync(
                final int listId,
                final APICallBack<String> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/lists/{list_id}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 5517266086054906417L;
=======
            private static final long serialVersionUID = 5600150121075325347L;
>>>>>>> Stashed changes
            {
                    put( "list_id", listId );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 5223525952721257328L;
=======
            private static final long serialVersionUID = 4745478622594589935L;
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

    /**
     * Remove duplicate contacts
     * @param    listId    Required parameter: Your list id
     * @return    Returns the String response from the API call 
     */
    public String removeDuplicateContacts(
                final int listId
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        removeDuplicateContactsAsync(listId, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Remove duplicate contacts
     * @param    listId    Required parameter: Your list id
     * @return    Returns the void response from the API call 
     */
    public void removeDuplicateContactsAsync(
                final int listId,
                final APICallBack<String> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/lists/{list_id}/remove-duplicates");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 5356841629669810685L;
=======
            private static final long serialVersionUID = 5497897483090415691L;
>>>>>>> Stashed changes
            {
                    put( "list_id", listId );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 5528455039207103577L;
=======
            private static final long serialVersionUID = 5623746464682964815L;
>>>>>>> Stashed changes
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
     * Update specific contact list
     * @param    listId    Required parameter: Your list id
     * @param    listName    Required parameter: Your new list name
     * @return    Returns the String response from the API call 
     */
    public String updateContactList(
                final int listId,
                final String listName
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        updateContactListAsync(listId, listName, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Update specific contact list
     * @param    listId    Required parameter: Your list id
     * @param    listName    Required parameter: Your new list name
     * @return    Returns the void response from the API call 
     */
    public void updateContactListAsync(
                final int listId,
                final String listName,
                final APICallBack<String> callBack
    ) {
        //validating required parameters
        if (null == listName)
            throw new NullPointerException("The parameter \"listName\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/lists/{list_id}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 5450370699738690836L;
=======
            private static final long serialVersionUID = 5720657300981722487L;
>>>>>>> Stashed changes
            {
                    put( "list_id", listId );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 5267206165019799430L;
=======
            private static final long serialVersionUID = 5237926093560920185L;
>>>>>>> Stashed changes
            {
                    put( "user-agent", "ClickSendSDK" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().putBody(_queryUrl, _headers, listName,
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
     * Import contacts to list
     * @param    listId    Required parameter: Your contact list id you want to access.
     * @param    file    Required parameter: ContactListImport model
     * @return    Returns the String response from the API call 
     */
    public String importContactsToList(
                final int listId,
                final ContactListImport file
    ) throws Throwable {
        APICallBackCatcher<String> callback = new APICallBackCatcher<String>();
        importContactsToListAsync(listId, file, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Import contacts to list
     * @param    listId    Required parameter: Your contact list id you want to access.
     * @param    file    Required parameter: ContactListImport model
     * @return    Returns the void response from the API call 
     */
    public void importContactsToListAsync(
                final int listId,
                final ContactListImport file,
                final APICallBack<String> callBack
    ) throws JsonProcessingException {
        //validating required parameters
        if (null == file)
            throw new NullPointerException("The parameter \"file\" is a required parameter and cannot be null.");

        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/lists/{list_id}/import");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(_queryBuilder, new HashMap<String, Object>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 4847899126107907876L;
=======
            private static final long serialVersionUID = 4952196483708830180L;
>>>>>>> Stashed changes
            {
                    put( "list_id", listId );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
<<<<<<< Updated upstream
            private static final long serialVersionUID = 4696661682940253970L;
=======
            private static final long serialVersionUID = 5301373641673455097L;
>>>>>>> Stashed changes
            {
                    put( "user-agent", "ClickSendSDK" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().postBody(_queryUrl, _headers, APIHelper.serialize(file),
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