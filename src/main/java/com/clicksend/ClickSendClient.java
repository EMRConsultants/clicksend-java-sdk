/*
 * ClickSend
 *
 * This file was automatically generated for ClickSend by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.clicksend;

import com.clicksend.controllers.*;
import com.clicksend.http.client.HttpClient;

public class ClickSendClient {
    /**
     * Singleton access to PostPostcard controller
     * @return	Returns the PostPostcardController instance 
     */
    public PostPostcardController getPostPostcard() {
        return PostPostcardController.getInstance();
    }

    /**
     * Singleton access to Fax controller
     * @return	Returns the FaxController instance 
     */
    public FaxController getFax() {
        return FaxController.getInstance();
    }

    /**
     * Singleton access to Countries controller
     * @return	Returns the CountriesController instance 
     */
    public CountriesController getCountries() {
        return CountriesController.getInstance();
    }

    /**
     * Singleton access to SMS controller
     * @return	Returns the SMSController instance 
     */
    public SMSController getSMS() {
        return SMSController.getInstance();
    }

    /**
     * Singleton access to Voice controller
     * @return	Returns the VoiceController instance 
     */
    public VoiceController getVoice() {
        return VoiceController.getInstance();
    }

    /**
     * Singleton access to Account controller
     * @return	Returns the AccountController instance 
     */
    public AccountController getAccount() {
        return AccountController.getInstance();
    }

    /**
     * Singleton access to Subaccount controller
     * @return	Returns the SubaccountController instance 
     */
    public SubaccountController getSubaccount() {
        return SubaccountController.getInstance();
    }

    /**
     * Singleton access to Contact controller
     * @return	Returns the ContactController instance 
     */
    public ContactController getContact() {
        return ContactController.getInstance();
    }

    /**
     * Singleton access to ContactList controller
     * @return	Returns the ContactListController instance 
     */
    public ContactListController getContactList() {
        return ContactListController.getInstance();
    }

    /**
     * Singleton access to ResellerAccount controller
     * @return	Returns the ResellerAccountController instance 
     */
    public ResellerAccountController getResellerAccount() {
        return ResellerAccountController.getInstance();
    }

    /**
     * Singleton access to Number controller
     * @return	Returns the NumberController instance 
     */
    public NumberController getNumber() {
        return NumberController.getInstance();
    }

    /**
     * Singleton access to Statistics controller
     * @return	Returns the StatisticsController instance 
     */
    public StatisticsController getStatistics() {
        return StatisticsController.getInstance();
    }

    /**
     * Singleton access to EmailToSms controller
     * @return	Returns the EmailToSmsController instance 
     */
    public EmailToSmsController getEmailToSms() {
        return EmailToSmsController.getInstance();
    }

    /**
     * Singleton access to Search controller
     * @return	Returns the SearchController instance 
     */
    public SearchController getSearch() {
        return SearchController.getInstance();
    }

    /**
     * Singleton access to ReferralAccount controller
     * @return	Returns the ReferralAccountController instance 
     */
    public ReferralAccountController getReferralAccount() {
        return ReferralAccountController.getInstance();
    }

    /**
     * Singleton access to TransferCredit controller
     * @return	Returns the TransferCreditController instance 
     */
    public TransferCreditController getTransferCredit() {
        return TransferCreditController.getInstance();
    }

    /**
     * Singleton access to PostReturnAddress controller
     * @return	Returns the PostReturnAddressController instance 
     */
    public PostReturnAddressController getPostReturnAddress() {
        return PostReturnAddressController.getInstance();
    }

    /**
     * Singleton access to AccountRecharge controller
     * @return	Returns the AccountRechargeController instance 
     */
    public AccountRechargeController getAccountRecharge() {
        return AccountRechargeController.getInstance();
    }

    /**
     * Singleton access to SmsCampaign controller
     * @return	Returns the SmsCampaignController instance 
     */
    public SmsCampaignController getSmsCampaign() {
        return SmsCampaignController.getInstance();
    }

    /**
     * Singleton access to PostLetter controller
     * @return	Returns the PostLetterController instance 
     */
    public PostLetterController getPostLetter() {
        return PostLetterController.getInstance();
    }

    /**
     * Singleton access to MMS controller
     * @return	Returns the MMSController instance 
     */
    public MMSController getMMS() {
        return MMSController.getInstance();
    }

    /**
     * Singleton access to Upload controller
     * @return	Returns the UploadController instance 
     */
    public UploadController getUpload() {
        return UploadController.getInstance();
    }

    /**
     * Singleton access to PostDirectMail controller
     * @return	Returns the PostDirectMailController instance 
     */
    public PostDirectMailController getPostDirectMail() {
        return PostDirectMailController.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Default constructor 
     */     
    public ClickSendClient() {
    }

    /**
     * Client initialization constructor 
     */     
    public ClickSendClient(String username, String key) {
        this();
        Configuration.username = username;
        Configuration.key = key;
    }
}