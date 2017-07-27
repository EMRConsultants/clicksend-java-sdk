# Getting started

Clicksend v3 API

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=ClickSend-Java&workspaceName=ClickSend&projectName=ClickSend&rootNamespace=com.clicksend)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=ClickSend-Java&workspaceName=ClickSend&projectName=ClickSend&rootNamespace=com.clicksend)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=ClickSend-Java&workspaceName=ClickSend&projectName=ClickSend&rootNamespace=com.clicksend)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=ClickSend-Java&workspaceName=ClickSend&projectName=ClickSend&rootNamespace=com.clicksend)

## How to Use

The following section explains how to use the ClickSend library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=ClickSend-Java&workspaceName=ClickSend&projectName=ClickSend&rootNamespace=com.clicksend)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=ClickSend-Java&workspaceName=ClickSend&projectName=ClickSend&rootNamespace=com.clicksend)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=ClickSend-Java&workspaceName=ClickSend&projectName=ClickSend&rootNamespace=com.clicksend)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=ClickSend-Java&workspaceName=ClickSend&projectName=ClickSend&rootNamespace=com.clicksend)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=ClickSend-Java&workspaceName=ClickSend&projectName=ClickSend&rootNamespace=com.clicksend)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *ClickSend* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=ClickSend-Java&workspaceName=ClickSend&projectName=ClickSend&rootNamespace=com.clicksend)

Clicking the ``` Add ``` button will open a dialog where you need to specify ClickSend in ``` Group Id ``` and ClickSend in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=ClickSend-Java&workspaceName=ClickSend&projectName=ClickSend&rootNamespace=com.clicksend)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=ClickSend-Java&workspaceName=ClickSend&projectName=ClickSend&rootNamespace=com.clicksend)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *ClickSend* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| username | your username |
| key | your api key |



API client can be initialized as following.

```java
// Configuration parameters and credentials
String username = "username"; // your username
String key = "key"; // your api key

ClickSendClient client = new ClickSendClient(username, key);
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [PostPostcardController](#post_postcard_controller)
* [FaxController](#fax_controller)
* [CountriesController](#countries_controller)
* [SMSController](#sms_controller)
* [VoiceController](#voice_controller)
* [AccountController](#account_controller)
* [SubaccountController](#subaccount_controller)
* [ContactController](#contact_controller)
* [ContactListController](#contact_list_controller)
* [ResellerAccountController](#reseller_account_controller)
* [NumberController](#number_controller)
* [StatisticsController](#statistics_controller)
* [EmailToSmsController](#email_to_sms_controller)
* [SearchController](#search_controller)
* [ReferralAccountController](#referral_account_controller)
* [TransferCreditController](#transfer_credit_controller)
* [PostReturnAddressController](#post_return_address_controller)
* [AccountRechargeController](#account_recharge_controller)
* [SmsCampaignController](#sms_campaign_controller)
* [PostLetterController](#post_letter_controller)
* [MMSController](#mms_controller)
* [UploadController](#upload_controller)
* [PostDirectMailController](#post_direct_mail_controller)

## <a name="post_postcard_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.clicksend.controllers.PostPostcardController") PostPostcardController

### Get singleton instance

The singleton instance of the ``` PostPostcardController ``` class can be accessed from the API Client.

```java
PostPostcardController postPostcard = client.getPostPostcard();
```

### <a name="calculate_price_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.PostPostcardController.calculatePriceAsync") calculatePriceAsync

> Calculate price for sending one or more postcards


```java
void calculatePriceAsync(
        final PostPostcard postPostcards,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| postPostcards |  ``` Required ```  | PostPostcard model |


#### Example Usage

```java
try {
    PostPostcard postPostcards = new PostPostcard();
    // Invoking the API call with sample inputs
    postPostcard.calculatePriceAsync(postPostcards, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="send_postcard_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.PostPostcardController.sendPostcardAsync") sendPostcardAsync

> Send one or more postcards


```java
void sendPostcardAsync(
        final PostPostcard postPostcards,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| postPostcards |  ``` Required ```  | PostPostcard model |


#### Example Usage

```java
try {
    PostPostcard postPostcards = new PostPostcard();
    // Invoking the API call with sample inputs
    postPostcard.sendPostcardAsync(postPostcards, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_postcard_history_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.PostPostcardController.getPostcardHistoryAsync") getPostcardHistoryAsync

> Retrieve the history of postcards sent or scheduled


```java
void getPostcardHistoryAsync(final APICallBack<String> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
postPostcard.getPostcardHistoryAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="export_postcard_history_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.PostPostcardController.exportPostcardHistoryAsync") exportPostcardHistoryAsync

> Export postcard history to a CSV file


```java
void exportPostcardHistoryAsync(
        final String filename,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| filename |  ``` Required ```  | Filename to export to |


#### Example Usage

```java
String filename = "filename";
// Invoking the API call with sample inputs
postPostcard.exportPostcardHistoryAsync(filename, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="fax_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.clicksend.controllers.FaxController") FaxController

### Get singleton instance

The singleton instance of the ``` FaxController ``` class can be accessed from the API Client.

```java
FaxController fax = client.getFax();
```

### <a name="get_fax_receipt_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.FaxController.getFaxReceiptAsync") getFaxReceiptAsync

> Get a single fax receipt based on message id.


```java
void getFaxReceiptAsync(
        final String messageId,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| messageId |  ``` Required ```  | ID of the message receipt to retrieve |


#### Example Usage

```java
String messageId = "message_id";
// Invoking the API call with sample inputs
fax.getFaxReceiptAsync(messageId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_fax_history_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.FaxController.getFaxHistoryAsync") getFaxHistoryAsync

> Get a list of Fax History.


```java
void getFaxHistoryAsync(
        final Integer dateFrom,
        final Integer dateTo,
        final String q,
        final String order,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| dateFrom |  ``` Optional ```  | Customize result by setting from date (timestsamp) Example: 1457572619. |
| dateTo |  ``` Optional ```  | Customize result by setting to date (timestamp) Example: 1457573000. |
| q |  ``` Optional ```  | Custom query Example: status:Sent,status_code:201. |
| order |  ``` Optional ```  | Order result by Example: date_added:desc,list_id:desc. |


#### Example Usage

```java
Integer dateFrom = 233;
Integer dateTo = 233;
String q = "q";
String order = "order";
// Invoking the API call with sample inputs
fax.getFaxHistoryAsync(dateFrom, dateTo, q, order, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="fax_receipt_list_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.FaxController.faxReceiptListAsync") faxReceiptListAsync

> Get List of Fax Receipts


```java
void faxReceiptListAsync(final APICallBack<String> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
fax.faxReceiptListAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="calculate_price_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.FaxController.calculatePriceAsync") calculatePriceAsync

> Calculate Total Price for Fax Messages sent


```java
void calculatePriceAsync(
        final FaxMessageCollection faxMessage,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| faxMessage |  ``` Required ```  | FaxMessageCollection model |


#### Example Usage

```java
try {
    FaxMessageCollection faxMessage = new FaxMessageCollection();
    // Invoking the API call with sample inputs
    fax.calculatePriceAsync(faxMessage, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="send_fax_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.FaxController.sendFaxAsync") sendFaxAsync

> Send a fax using supplied supported file-types.


```java
void sendFaxAsync(
        final FaxMessageCollection faxMessage,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| faxMessage |  ``` Required ```  | FaxMessageCollection model |


#### Example Usage

```java
try {
    FaxMessageCollection faxMessage = new FaxMessageCollection();
    // Invoking the API call with sample inputs
    fax.sendFaxAsync(faxMessage, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

## <a name="countries_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.clicksend.controllers.CountriesController") CountriesController

### Get singleton instance

The singleton instance of the ``` CountriesController ``` class can be accessed from the API Client.

```java
CountriesController countries = client.getCountries();
```

### <a name="get_countries_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.CountriesController.getCountriesAsync") getCountriesAsync

> *Tags:*  ``` Skips Authentication ``` 

> Get all countries


```java
void getCountriesAsync(final APICallBack<String> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
countries.getCountriesAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="sms_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.clicksend.controllers.SMSController") SMSController

### Get singleton instance

The singleton instance of the ``` SMSController ``` class can be accessed from the API Client.

```java
SMSController sMS = client.getSMS();
```

### <a name="send_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SMSController.sendSmsAsync") sendSmsAsync

> Send one or more SMS messages


```java
void sendSmsAsync(
        final SmsMessageCollection smsMessages,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| smsMessages |  ``` Required ```  | SmsMessageCollection model |


#### Example Usage

```java
try {
    SmsMessageCollection smsMessages = new SmsMessageCollection();
    // Invoking the API call with sample inputs
    sMS.sendSmsAsync(smsMessages, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="calculate_price_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SMSController.calculatePriceAsync") calculatePriceAsync

> Calculate sms price


```java
void calculatePriceAsync(
        final SmsMessageCollection smsMessages,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| smsMessages |  ``` Required ```  | SmsMessageCollection model |


#### Example Usage

```java
try {
    SmsMessageCollection smsMessages = new SmsMessageCollection();
    // Invoking the API call with sample inputs
    sMS.calculatePriceAsync(smsMessages, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="export_history_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SMSController.exportHistoryAsync") exportHistoryAsync

> Export all sms history


```java
void exportHistoryAsync(
        final String filename,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| filename |  ``` Required ```  | Filename to download history as |


#### Example Usage

```java
String filename = "filename";
// Invoking the API call with sample inputs
sMS.exportHistoryAsync(filename, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_receipt_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SMSController.createReceiptAsync") createReceiptAsync

> Add a delivery receipt


```java
void createReceiptAsync(
        final String url,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| url |  ``` Required ```  | Your url |


#### Example Usage

```java
String url = "url";
// Invoking the API call with sample inputs
sMS.createReceiptAsync(url, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="mark_receipts_as_read_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SMSController.markReceiptsAsReadAsync") markReceiptsAsReadAsync

> Marked delivery receipts as read


```java
void markReceiptsAsReadAsync(
        final String dateBefore,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| dateBefore |  ``` Optional ```  | Mark all as read before this timestamp |


#### Example Usage

```java
String dateBefore = "date_before";
// Invoking the API call with sample inputs
sMS.markReceiptsAsReadAsync(dateBefore, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_inbound_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SMSController.getInboundSmsAsync") getInboundSmsAsync

> Get all inbound sms


```java
void getInboundSmsAsync(final APICallBack<String> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
sMS.getInboundSmsAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_inbound_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SMSController.createInboundSmsAsync") createInboundSmsAsync

> Create inbound sms


```java
void createInboundSmsAsync(
        final String url,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| url |  ``` Required ```  | Your url |


#### Example Usage

```java
String url = "url";
// Invoking the API call with sample inputs
sMS.createInboundSmsAsync(url, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="cancel_scheduled_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SMSController.cancelScheduledSmsAsync") cancelScheduledSmsAsync

> Update scheduled message as cancel


```java
void cancelScheduledSmsAsync(
        final String messageId,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| messageId |  ``` Required ```  | The message ID you want to cancel |


#### Example Usage

```java
String messageId = "message_id";
// Invoking the API call with sample inputs
sMS.cancelScheduledSmsAsync(messageId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="cancel_all_scheduled_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SMSController.cancelAllScheduledSmsAsync") cancelAllScheduledSmsAsync

> Update all scheduled message as cancelled


```java
void cancelAllScheduledSmsAsync(final APICallBack<String> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
sMS.cancelAllScheduledSmsAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_sms_template_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SMSController.createSmsTemplateAsync") createSmsTemplateAsync

> Create sms template


```java
void createSmsTemplateAsync(
        final SmsTemplate smsTemplate,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| smsTemplate |  ``` Required ```  | SmsTemplate model |


#### Example Usage

```java
try {
    SmsTemplate smsTemplate = new SmsTemplate();
    // Invoking the API call with sample inputs
    sMS.createSmsTemplateAsync(smsTemplate, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="delete_sms_template_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SMSController.deleteSmsTemplateAsync") deleteSmsTemplateAsync

> Delete sms template


```java
void deleteSmsTemplateAsync(
        final int templateId,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| templateId |  ``` Required ```  | Template id |


#### Example Usage

```java
int templateId = 233;
// Invoking the API call with sample inputs
sMS.deleteSmsTemplateAsync(templateId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_sms_template_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SMSController.updateSmsTemplateAsync") updateSmsTemplateAsync

> Update sms template


```java
void updateSmsTemplateAsync(
        final int templateId,
        final SmsTemplate smsTemplate,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| templateId |  ``` Required ```  | Template id |
| smsTemplate |  ``` Required ```  | Template item |


#### Example Usage

```java
try {
    int templateId = 233;
    SmsTemplate smsTemplate = new SmsTemplate();
    // Invoking the API call with sample inputs
    sMS.updateSmsTemplateAsync(templateId, smsTemplate, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_delivery_receipts_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SMSController.getDeliveryReceiptsAsync") getDeliveryReceiptsAsync

> Get all delivery receipts


```java
void getDeliveryReceiptsAsync(final APICallBack<String> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
sMS.getDeliveryReceiptsAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_sms_templates_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SMSController.getSmsTemplatesAsync") getSmsTemplatesAsync

> Get lists of all sms templates


```java
void getSmsTemplatesAsync(final APICallBack<String> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
sMS.getSmsTemplatesAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="mark_all_inbound_sms_as_read_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SMSController.markAllInboundSMSAsReadAsync") markAllInboundSMSAsReadAsync

> Mark all inbound SMS as read optionally before a certain date


```java
void markAllInboundSMSAsReadAsync(
        final String dateBefore,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| dateBefore |  ``` Optional ```  | An optional timestamp - mark all as read before this timestamp. If not given, all messages will be marked as read. |


#### Example Usage

```java
String dateBefore = "date_before";
// Invoking the API call with sample inputs
sMS.markAllInboundSMSAsReadAsync(dateBefore, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_specific_delivery_receipt_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SMSController.getSpecificDeliveryReceiptAsync") getSpecificDeliveryReceiptAsync

> Get a Specific Delivery Receipt


```java
void getSpecificDeliveryReceiptAsync(
        final String messageId,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| messageId |  ``` Required ```  | Message ID |


#### Example Usage

```java
String messageId = "message_id";
// Invoking the API call with sample inputs
sMS.getSpecificDeliveryReceiptAsync(messageId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_sms_history_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SMSController.getSmsHistoryAsync") getSmsHistoryAsync

> Get all sms history


```java
void getSmsHistoryAsync(
        final Integer dateFrom,
        final Integer dateTo,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| dateFrom |  ``` Optional ```  | Start date |
| dateTo |  ``` Optional ```  | End date |


#### Example Usage

```java
Integer dateFrom = 233;
Integer dateTo = 233;
// Invoking the API call with sample inputs
sMS.getSmsHistoryAsync(dateFrom, dateTo, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="voice_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.clicksend.controllers.VoiceController") VoiceController

### Get singleton instance

The singleton instance of the ``` VoiceController ``` class can be accessed from the API Client.

```java
VoiceController voice = client.getVoice();
```

### <a name="send_voice_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.VoiceController.sendVoiceAsync") sendVoiceAsync

> Send a voice call


```java
void sendVoiceAsync(
        final VoiceMessageCollection voiceMessages,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| voiceMessages |  ``` Required ```  | VoiceMessageCollection model |


#### Example Usage

```java
try {
    VoiceMessageCollection voiceMessages = new VoiceMessageCollection();
    // Invoking the API call with sample inputs
    voice.sendVoiceAsync(voiceMessages, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="calculate_price_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.VoiceController.calculatePriceAsync") calculatePriceAsync

> Calculate voice price


```java
void calculatePriceAsync(
        final VoiceMessageCollection voiceMessages,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| voiceMessages |  ``` Required ```  | VoiceMessageCollection model |


#### Example Usage

```java
try {
    VoiceMessageCollection voiceMessages = new VoiceMessageCollection();
    // Invoking the API call with sample inputs
    voice.calculatePriceAsync(voiceMessages, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_voice_languages_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.VoiceController.getVoiceLanguagesAsync") getVoiceLanguagesAsync

> Get all voice languages


```java
void getVoiceLanguagesAsync(final APICallBack<String> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
voice.getVoiceLanguagesAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_voice_receipts_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.VoiceController.getVoiceReceiptsAsync") getVoiceReceiptsAsync

> Get all voice receipts


```java
void getVoiceReceiptsAsync(final APICallBack<String> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
voice.getVoiceReceiptsAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="cancel_voice_message_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.VoiceController.cancelVoiceMessageAsync") cancelVoiceMessageAsync

> Update voice message status as cancelled


```java
void cancelVoiceMessageAsync(
        final String messageId,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| messageId |  ``` Required ```  | Your voice message id |


#### Example Usage

```java
String messageId = "message_id";
// Invoking the API call with sample inputs
voice.cancelVoiceMessageAsync(messageId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="cancel_voice_messages_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.VoiceController.cancelVoiceMessagesAsync") cancelVoiceMessagesAsync

> Update all voice messages as cancelled


```java
void cancelVoiceMessagesAsync(final APICallBack<String> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
voice.cancelVoiceMessagesAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="export_voice_history_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.VoiceController.exportVoiceHistoryAsync") exportVoiceHistoryAsync

> Export voice history


```java
void exportVoiceHistoryAsync(
        final String filename,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| filename |  ``` Required ```  | Filename to export to |


#### Example Usage

```java
String filename = "filename";
// Invoking the API call with sample inputs
voice.exportVoiceHistoryAsync(filename, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_voice_history_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.VoiceController.getVoiceHistoryAsync") getVoiceHistoryAsync

> Get all voice history


```java
void getVoiceHistoryAsync(
        final Integer dateFrom,
        final Integer dateTo,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| dateFrom |  ``` Optional ```  | Timestamp (from) used to show records by date. |
| dateTo |  ``` Optional ```  | Timestamp (to) used to show records by date |


#### Example Usage

```java
Integer dateFrom = 233;
Integer dateTo = 233;
// Invoking the API call with sample inputs
voice.getVoiceHistoryAsync(dateFrom, dateTo, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="account_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.clicksend.controllers.AccountController") AccountController

### Get singleton instance

The singleton instance of the ``` AccountController ``` class can be accessed from the API Client.

```java
AccountController account = client.getAccount();
```

### <a name="get_account_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.AccountController.getAccountAsync") getAccountAsync

> Get account details


```java
void getAccountAsync(final APICallBack<String> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
account.getAccountAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_account_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.AccountController.createAccountAsync") createAccountAsync

> Create An Account


```java
void createAccountAsync(
        final Account account,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| account |  ``` Required ```  | Account model |


#### Example Usage

```java
try {
    Account account = new Account();
    // Invoking the API call with sample inputs
    account.createAccountAsync(account, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="account_verify_send_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.AccountController.accountVerifySendAsync") accountVerifySendAsync

> Send account activation token


```java
void accountVerifySendAsync(
        final AccountVerify accountVerify,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountVerify |  ``` Required ```  | Account details |


#### Example Usage

```java
try {
    AccountVerify accountVerify = new AccountVerify();
    // Invoking the API call with sample inputs
    account.accountVerifySendAsync(accountVerify, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="account_verify_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.AccountController.accountVerifyAsync") accountVerifyAsync

> Verify new account


```java
void accountVerifyAsync(
        final int activationToken,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| activationToken |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int activationToken = 233;
// Invoking the API call with sample inputs
account.accountVerifyAsync(activationToken, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="forgot_username_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.AccountController.forgotUsernameAsync") forgotUsernameAsync

> *Tags:*  ``` Skips Authentication ``` 

> Forgot username


```java
void forgotUsernameAsync(
        final String email,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| email |  ``` Required ```  | Email belonging to account |


#### Example Usage

```java
String email = "email";
// Invoking the API call with sample inputs
account.forgotUsernameAsync(email, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="forgot_password_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.AccountController.forgotPasswordAsync") forgotPasswordAsync

> Forgot password


```java
void forgotPasswordAsync(
        final String username,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| username |  ``` Required ```  | Username belonging to account |


#### Example Usage

```java
String username = "username";
// Invoking the API call with sample inputs
account.forgotPasswordAsync(username, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="verify_forgot_password_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.AccountController.verifyForgotPasswordAsync") verifyForgotPasswordAsync

> Verify forgot password


```java
void verifyForgotPasswordAsync(
        final AccountForgotPasswordVerify verifyPassword,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| verifyPassword |  ``` Required ```  | verifyPassword data |


#### Example Usage

```java
try {
    AccountForgotPasswordVerify verifyPassword = new AccountForgotPasswordVerify();
    // Invoking the API call with sample inputs
    account.verifyForgotPasswordAsync(verifyPassword, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

## <a name="subaccount_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.clicksend.controllers.SubaccountController") SubaccountController

### Get singleton instance

The singleton instance of the ``` SubaccountController ``` class can be accessed from the API Client.

```java
SubaccountController subaccount = client.getSubaccount();
```

### <a name="get_subaccounts_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SubaccountController.getSubaccountsAsync") getSubaccountsAsync

> Get all subaccounts


```java
void getSubaccountsAsync(final APICallBack<String> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
subaccount.getSubaccountsAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_subaccount_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SubaccountController.updateSubaccountAsync") updateSubaccountAsync

> Update subaccount


```java
void updateSubaccountAsync(
        final int subaccountId,
        final Subaccount subaccount,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subaccountId |  ``` Required ```  | ID of subaccount to update |
| subaccount |  ``` Required ```  | Subaccount model |


#### Example Usage

```java
try {
    int subaccountId = 233;
    Subaccount subaccount = new Subaccount();
    // Invoking the API call with sample inputs
    subaccount.updateSubaccountAsync(subaccountId, subaccount, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_subaccount_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SubaccountController.getSubaccountAsync") getSubaccountAsync

> Get specific subaccount


```java
void getSubaccountAsync(
        final int subaccountId,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subaccountId |  ``` Required ```  | ID of subaccount to get |


#### Example Usage

```java
int subaccountId = 233;
// Invoking the API call with sample inputs
subaccount.getSubaccountAsync(subaccountId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="delete_subaccount_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SubaccountController.deleteSubaccountAsync") deleteSubaccountAsync

> Delete a subaccount


```java
void deleteSubaccountAsync(
        final int subaccountId,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subaccountId |  ``` Required ```  | ID of subaccount to delete |


#### Example Usage

```java
int subaccountId = 233;
// Invoking the API call with sample inputs
subaccount.deleteSubaccountAsync(subaccountId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="regenerate_api_key_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SubaccountController.regenerateApiKeyAsync") regenerateApiKeyAsync

> Regenerate an API Key


```java
void regenerateApiKeyAsync(
        final int subaccountId,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subaccountId |  ``` Required ```  | ID of subaccount to regenerate API key for |


#### Example Usage

```java
int subaccountId = 233;
// Invoking the API call with sample inputs
subaccount.regenerateApiKeyAsync(subaccountId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_subaccount_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SubaccountController.createSubaccountAsync") createSubaccountAsync

> Create new subaccount


```java
void createSubaccountAsync(
        final Subaccount subaccount,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subaccount |  ``` Required ```  | Subaccount model |


#### Example Usage

```java
try {
    Subaccount subaccount = new Subaccount();
    // Invoking the API call with sample inputs
    subaccount.createSubaccountAsync(subaccount, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

## <a name="contact_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.clicksend.controllers.ContactController") ContactController

### Get singleton instance

The singleton instance of the ``` ContactController ``` class can be accessed from the API Client.

```java
ContactController contact = client.getContact();
```

### <a name="create_contact_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.ContactController.createContactAsync") createContactAsync

> Create new contact


```java
void createContactAsync(
        final Contact contact,
        final int listId,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| contact |  ``` Required ```  | Contact model |
| listId |  ``` Required ```  | List id |


#### Example Usage

```java
try {
    Contact contact = new Contact();
    int listId = 233;
    // Invoking the API call with sample inputs
    contact.createContactAsync(contact, listId, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_contacts_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.ContactController.getContactsAsync") getContactsAsync

> Get all contacts in a list


```java
void getContactsAsync(
        final int listId,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| listId |  ``` Required ```  | Contact list ID |


#### Example Usage

```java
int listId = 233;
// Invoking the API call with sample inputs
contact.getContactsAsync(listId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_contact_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.ContactController.updateContactAsync") updateContactAsync

> Update contact


```java
void updateContactAsync(
        final int listId,
        final int contactId,
        final Contact contact,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| listId |  ``` Required ```  | Contact list id |
| contactId |  ``` Required ```  | Contact ID |
| contact |  ``` Required ```  | Contact model |


#### Example Usage

```java
try {
    int listId = 233;
    int contactId = 233;
    Contact contact = new Contact();
    // Invoking the API call with sample inputs
    contact.updateContactAsync(listId, contactId, contact, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_contact_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.ContactController.getContactAsync") getContactAsync

> Get a specific contact


```java
void getContactAsync(
        final int listId,
        final int contactId,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| listId |  ``` Required ```  | Your contact list id you want to access. |
| contactId |  ``` Required ```  | Your contact id you want to access. |


#### Example Usage

```java
int listId = 233;
int contactId = 233;
// Invoking the API call with sample inputs
contact.getContactAsync(listId, contactId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="remove_opted_out_contacts_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.ContactController.removeOptedOutContactsAsync") removeOptedOutContactsAsync

> Remove all opted out contacts


```java
void removeOptedOutContactsAsync(
        final int listId,
        final int optOutListId,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| listId |  ``` Required ```  | Your list id |
| optOutListId |  ``` Required ```  | Your opt out list id |


#### Example Usage

```java
int listId = 233;
int optOutListId = 233;
// Invoking the API call with sample inputs
contact.removeOptedOutContactsAsync(listId, optOutListId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="delete_contact_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.ContactController.deleteContactAsync") deleteContactAsync

> Delete a contact


```java
void deleteContactAsync(
        final int listId,
        final int contactId,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| listId |  ``` Required ```  | List ID |
| contactId |  ``` Required ```  | Contact ID |


#### Example Usage

```java
int listId = 233;
int contactId = 233;
// Invoking the API call with sample inputs
contact.deleteContactAsync(listId, contactId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="contact_list_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.clicksend.controllers.ContactListController") ContactListController

### Get singleton instance

The singleton instance of the ``` ContactListController ``` class can be accessed from the API Client.

```java
ContactListController contactList = client.getContactList();
```

### <a name="get_contact_lists_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.ContactListController.getContactListsAsync") getContactListsAsync

> Get all contact lists


```java
void getContactListsAsync(final APICallBack<String> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
contactList.getContactListsAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_contact_list_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.ContactListController.createContactListAsync") createContactListAsync

> Create new contact list


```java
void createContactListAsync(
        final String listName,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| listName |  ``` Required ```  | Your contact list name |


#### Example Usage

```java
String listName = "list_name";
// Invoking the API call with sample inputs
contactList.createContactListAsync(listName, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_contact_list_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.ContactListController.getContactListAsync") getContactListAsync

> Get specific contact list


```java
void getContactListAsync(
        final int listId,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| listId |  ``` Required ```  | List ID |


#### Example Usage

```java
int listId = 233;
// Invoking the API call with sample inputs
contactList.getContactListAsync(listId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="delete_contact_list_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.ContactListController.deleteContactListAsync") deleteContactListAsync

> Delete a specific contact list


```java
void deleteContactListAsync(
        final int listId,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| listId |  ``` Required ```  | List ID |


#### Example Usage

```java
int listId = 233;
// Invoking the API call with sample inputs
contactList.deleteContactListAsync(listId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="remove_duplicate_contacts_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.ContactListController.removeDuplicateContactsAsync") removeDuplicateContactsAsync

> Remove duplicate contacts


```java
void removeDuplicateContactsAsync(
        final int listId,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| listId |  ``` Required ```  | Your list id |


#### Example Usage

```java
int listId = 233;
// Invoking the API call with sample inputs
contactList.removeDuplicateContactsAsync(listId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_contact_list_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.ContactListController.updateContactListAsync") updateContactListAsync

> Update specific contact list


```java
void updateContactListAsync(
        final int listId,
        final String listName,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| listId |  ``` Required ```  | Your list id |
| listName |  ``` Required ```  | Your new list name |


#### Example Usage

```java
int listId = 233;
String listName = "list_name";
// Invoking the API call with sample inputs
contactList.updateContactListAsync(listId, listName, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="import_contacts_to_list_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.ContactListController.importContactsToListAsync") importContactsToListAsync

> Import contacts to list


```java
void importContactsToListAsync(
        final int listId,
        final ContactListImport file,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| listId |  ``` Required ```  | Your contact list id you want to access. |
| file |  ``` Required ```  | ContactListImport model |


#### Example Usage

```java
try {
    int listId = 233;
    ContactListImport file = new ContactListImport();
    // Invoking the API call with sample inputs
    contactList.importContactsToListAsync(listId, file, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

## <a name="reseller_account_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.clicksend.controllers.ResellerAccountController") ResellerAccountController

### Get singleton instance

The singleton instance of the ``` ResellerAccountController ``` class can be accessed from the API Client.

```java
ResellerAccountController resellerAccount = client.getResellerAccount();
```

### <a name="update_reseller_account_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.ResellerAccountController.updateResellerAccountAsync") updateResellerAccountAsync

> Reseller Account


```java
void updateResellerAccountAsync(
        final int clientUserId,
        final ResellerAccount resellerAccount,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| clientUserId |  ``` Required ```  | User ID of client |
| resellerAccount |  ``` Required ```  | ResellerAccount model |


#### Example Usage

```java
try {
    int clientUserId = 233;
    ResellerAccount resellerAccount = new ResellerAccount();
    // Invoking the API call with sample inputs
    resellerAccount.updateResellerAccountAsync(clientUserId, resellerAccount, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_reseller_accounts_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.ResellerAccountController.getResellerAccountsAsync") getResellerAccountsAsync

> Get list of reseller accounts


```java
void getResellerAccountsAsync(final APICallBack<String> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
resellerAccount.getResellerAccountsAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_reseller_account_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.ResellerAccountController.createResellerAccountAsync") createResellerAccountAsync

> Create reseller account


```java
void createResellerAccountAsync(
        final ResellerAccount resellerAccount,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| resellerAccount |  ``` Required ```  | ResellerAccount model |


#### Example Usage

```java
try {
    ResellerAccount resellerAccount = new ResellerAccount();
    // Invoking the API call with sample inputs
    resellerAccount.createResellerAccountAsync(resellerAccount, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_reseller_account_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.ResellerAccountController.getResellerAccountAsync") getResellerAccountAsync

> Get Reseller Account


```java
void getResellerAccountAsync(
        final int clientUserId,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| clientUserId |  ``` Required ```  | User ID of client |


#### Example Usage

```java
int clientUserId = 233;
// Invoking the API call with sample inputs
resellerAccount.getResellerAccountAsync(clientUserId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="number_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.clicksend.controllers.NumberController") NumberController

### Get singleton instance

The singleton instance of the ``` NumberController ``` class can be accessed from the API Client.

```java
NumberController number = client.getNumber();
```

### <a name="get_dedicated_numbers_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.NumberController.getDedicatedNumbersAsync") getDedicatedNumbersAsync

> Get all dedicated numbers


```java
void getDedicatedNumbersAsync(final APICallBack<String> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
number.getDedicatedNumbersAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="purchase_dedicated_number_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.NumberController.purchaseDedicatedNumberAsync") purchaseDedicatedNumberAsync

> Buy dedicated number


```java
void purchaseDedicatedNumberAsync(
        final String dedicatedNumber,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| dedicatedNumber |  ``` Required ```  | Phone number to purchase |


#### Example Usage

```java
String dedicatedNumber = "dedicated_number";
// Invoking the API call with sample inputs
number.purchaseDedicatedNumberAsync(dedicatedNumber, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_dedicated_numbers_by_country_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.NumberController.getDedicatedNumbersByCountryAsync") getDedicatedNumbersByCountryAsync

> Get all dedicated numbers by country


```java
void getDedicatedNumbersByCountryAsync(
        final String country,
        final String search,
        final Integer searchType,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| country |  ``` Required ```  | Country code to search |
| search |  ``` Optional ```  | Your search pattern or query. |
| searchType |  ``` Optional ```  | Your strategy for searching, 0 = starts with, 1 = anywhere, 2 = ends with. |


#### Example Usage

```java
String country = "country";
String search = "search";
Integer searchType = 233;
// Invoking the API call with sample inputs
number.getDedicatedNumbersByCountryAsync(country, search, searchType, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="statistics_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.clicksend.controllers.StatisticsController") StatisticsController

### Get singleton instance

The singleton instance of the ``` StatisticsController ``` class can be accessed from the API Client.

```java
StatisticsController statistics = client.getStatistics();
```

### <a name="get_voice_statistics_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.StatisticsController.getVoiceStatisticsAsync") getVoiceStatisticsAsync

> Get voice statistics


```java
void getVoiceStatisticsAsync(final APICallBack<String> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
statistics.getVoiceStatisticsAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_sms_statistics_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.StatisticsController.getSmsStatisticsAsync") getSmsStatisticsAsync

> Get sms statistics


```java
void getSmsStatisticsAsync(final APICallBack<String> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
statistics.getSmsStatisticsAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="email_to_sms_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.clicksend.controllers.EmailToSmsController") EmailToSmsController

### Get singleton instance

The singleton instance of the ``` EmailToSmsController ``` class can be accessed from the API Client.

```java
EmailToSmsController emailToSms = client.getEmailToSms();
```

### <a name="create_allowed_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.EmailToSmsController.createAllowedAddressAsync") createAllowedAddressAsync

> Create email to sms allowed address


```java
void createAllowedAddressAsync(
        final EmailSMSAddress emailSmsAddress,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| emailSmsAddress |  ``` Required ```  | EmailSMSAddress model |


#### Example Usage

```java
try {
    EmailSMSAddress emailSmsAddress = new EmailSMSAddress();
    // Invoking the API call with sample inputs
    emailToSms.createAllowedAddressAsync(emailSmsAddress, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_allowed_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.EmailToSmsController.getAllowedAddressAsync") getAllowedAddressAsync

> Get list of email to sms allowed addresses


```java
void getAllowedAddressAsync(final APICallBack<String> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
emailToSms.getAllowedAddressAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="search_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.clicksend.controllers.SearchController") SearchController

### Get singleton instance

The singleton instance of the ``` SearchController ``` class can be accessed from the API Client.

```java
SearchController search = client.getSearch();
```

### <a name="search_contact_list_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SearchController.searchContactListAsync") searchContactListAsync

> Get list of searched contact list


```java
void searchContactListAsync(
        final String q,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| q |  ``` Required ```  | Your keyword or query. |


#### Example Usage

```java
String q = "q";
// Invoking the API call with sample inputs
search.searchContactListAsync(q, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="referral_account_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.clicksend.controllers.ReferralAccountController") ReferralAccountController

### Get singleton instance

The singleton instance of the ``` ReferralAccountController ``` class can be accessed from the API Client.

```java
ReferralAccountController referralAccount = client.getReferralAccount();
```

### <a name="get_referral_accounts_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.ReferralAccountController.getReferralAccountsAsync") getReferralAccountsAsync

> Get all referral accounts


```java
void getReferralAccountsAsync(final APICallBack<String> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
referralAccount.getReferralAccountsAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="transfer_credit_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.clicksend.controllers.TransferCreditController") TransferCreditController

### Get singleton instance

The singleton instance of the ``` TransferCreditController ``` class can be accessed from the API Client.

```java
TransferCreditController transferCredit = client.getTransferCredit();
```

### <a name="transfer_credit_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.TransferCreditController.transferCreditAsync") transferCreditAsync

> Transfer Credit


```java
void transferCreditAsync(
        final ResellerAccountTransferCredit resellerAccountTransferCredit,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| resellerAccountTransferCredit |  ``` Required ```  | ResellerAccountTransferCredit model |


#### Example Usage

```java
try {
    ResellerAccountTransferCredit resellerAccountTransferCredit = new ResellerAccountTransferCredit();
    // Invoking the API call with sample inputs
    transferCredit.transferCreditAsync(resellerAccountTransferCredit, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

## <a name="post_return_address_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.clicksend.controllers.PostReturnAddressController") PostReturnAddressController

### Get singleton instance

The singleton instance of the ``` PostReturnAddressController ``` class can be accessed from the API Client.

```java
PostReturnAddressController postReturnAddress = client.getPostReturnAddress();
```

### <a name="update_post_return_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.PostReturnAddressController.updatePostReturnAddressAsync") updatePostReturnAddressAsync

> Update post return address


```java
void updatePostReturnAddressAsync(
        final int returnAddressId,
        final Address returnAddress,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| returnAddressId |  ``` Required ```  | Return address ID |
| returnAddress |  ``` Required ```  | Address model |


#### Example Usage

```java
try {
    int returnAddressId = 233;
    Address returnAddress = new Address();
    // Invoking the API call with sample inputs
    postReturnAddress.updatePostReturnAddressAsync(returnAddressId, returnAddress, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="create_post_return_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.PostReturnAddressController.createPostReturnAddressAsync") createPostReturnAddressAsync

> Create post return address


```java
void createPostReturnAddressAsync(
        final Address returnAddress,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| returnAddress |  ``` Required ```  | Address model |


#### Example Usage

```java
try {
    Address returnAddress = new Address();
    // Invoking the API call with sample inputs
    postReturnAddress.createPostReturnAddressAsync(returnAddress, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_post_return_addresses_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.PostReturnAddressController.getPostReturnAddressesAsync") getPostReturnAddressesAsync

> Get list of post return addresses


```java
void getPostReturnAddressesAsync(final APICallBack<String> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
postReturnAddress.getPostReturnAddressesAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_post_return_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.PostReturnAddressController.getPostReturnAddressAsync") getPostReturnAddressAsync

> Get specific post return address


```java
void getPostReturnAddressAsync(
        final int returnAddressId,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| returnAddressId |  ``` Required ```  | Return address ID |


#### Example Usage

```java
int returnAddressId = 233;
// Invoking the API call with sample inputs
postReturnAddress.getPostReturnAddressAsync(returnAddressId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="delete_post_return_address_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.PostReturnAddressController.deletePostReturnAddressAsync") deletePostReturnAddressAsync

> Delete specific post return address


```java
void deletePostReturnAddressAsync(
        final int returnAddressId,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| returnAddressId |  ``` Required ```  | Return address ID |


#### Example Usage

```java
int returnAddressId = 233;
// Invoking the API call with sample inputs
postReturnAddress.deletePostReturnAddressAsync(returnAddressId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="account_recharge_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.clicksend.controllers.AccountRechargeController") AccountRechargeController

### Get singleton instance

The singleton instance of the ``` AccountRechargeController ``` class can be accessed from the API Client.

```java
AccountRechargeController accountRecharge = client.getAccountRecharge();
```

### <a name="get_credit_card_info_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.AccountRechargeController.getCreditCardInfoAsync") getCreditCardInfoAsync

> Get Credit Card info


```java
void getCreditCardInfoAsync(final APICallBack<String> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
accountRecharge.getCreditCardInfoAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_credit_card_info_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.AccountRechargeController.updateCreditCardInfoAsync") updateCreditCardInfoAsync

> Update credit card info


```java
void updateCreditCardInfoAsync(
        final CreditCard creditCard,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| creditCard |  ``` Required ```  | CreditCard model |


#### Example Usage

```java
try {
    CreditCard creditCard = new CreditCard();
    // Invoking the API call with sample inputs
    accountRecharge.updateCreditCardInfoAsync(creditCard, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_packages_list_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.AccountRechargeController.getPackagesListAsync") getPackagesListAsync

> Get list of all packages


```java
void getPackagesListAsync(
        final String country,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| country |  ``` Optional ```  | Country code |


#### Example Usage

```java
String country = "country";
// Invoking the API call with sample inputs
accountRecharge.getPackagesListAsync(country, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="purchase_package_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.AccountRechargeController.purchasePackageAsync") purchasePackageAsync

> Purchase a package


```java
void purchasePackageAsync(
        final int packageId,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| packageId |  ``` Required ```  | ID of package to purchase |


#### Example Usage

```java
int packageId = 233;
// Invoking the API call with sample inputs
accountRecharge.purchasePackageAsync(packageId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_transactions_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.AccountRechargeController.getTransactionsAsync") getTransactionsAsync

> Get all transactions


```java
void getTransactionsAsync(final APICallBack<String> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
accountRecharge.getTransactionsAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_transaction_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.AccountRechargeController.getTransactionAsync") getTransactionAsync

> Get specific Transaction


```java
void getTransactionAsync(
        final String transactionId,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| transactionId |  ``` Required ```  | ID of transaction to retrieve |


#### Example Usage

```java
String transactionId = "transaction_id";
// Invoking the API call with sample inputs
accountRecharge.getTransactionAsync(transactionId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="sms_campaign_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.clicksend.controllers.SmsCampaignController") SmsCampaignController

### Get singleton instance

The singleton instance of the ``` SmsCampaignController ``` class can be accessed from the API Client.

```java
SmsCampaignController smsCampaign = client.getSmsCampaign();
```

### <a name="create_sms_campaign_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SmsCampaignController.createSmsCampaignAsync") createSmsCampaignAsync

> Create sms campaign


```java
void createSmsCampaignAsync(
        final SmsCampaign campaign,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| campaign |  ``` Required ```  | SmsCampaign model |


#### Example Usage

```java
try {
    SmsCampaign campaign = new SmsCampaign();
    // Invoking the API call with sample inputs
    smsCampaign.createSmsCampaignAsync(campaign, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="calculate_price_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SmsCampaignController.calculatePriceAsync") calculatePriceAsync

> Calculate price for sms campaign


```java
void calculatePriceAsync(
        final SmsCampaign campaign,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| campaign |  ``` Required ```  | SmsCampaign model |


#### Example Usage

```java
try {
    SmsCampaign campaign = new SmsCampaign();
    // Invoking the API call with sample inputs
    smsCampaign.calculatePriceAsync(campaign, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="update_sms_campaign_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SmsCampaignController.updateSmsCampaignAsync") updateSmsCampaignAsync

> Update sms campaign


```java
void updateSmsCampaignAsync(
        final int smsCampaignId,
        final SmsCampaign campaign,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| smsCampaignId |  ``` Required ```  | ID of SMS campaign to update |
| campaign |  ``` Required ```  | SmsCampaign model |


#### Example Usage

```java
try {
    int smsCampaignId = 233;
    SmsCampaign campaign = new SmsCampaign();
    // Invoking the API call with sample inputs
    smsCampaign.updateSmsCampaignAsync(smsCampaignId, campaign, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="cancel_sms_campaign_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SmsCampaignController.cancelSmsCampaignAsync") cancelSmsCampaignAsync

> Cancel sms campaign


```java
void cancelSmsCampaignAsync(
        final int smsCampaignId,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| smsCampaignId |  ``` Required ```  | ID of SMS Campaign to cancel |


#### Example Usage

```java
int smsCampaignId = 233;
// Invoking the API call with sample inputs
smsCampaign.cancelSmsCampaignAsync(smsCampaignId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_sms_campaigns_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SmsCampaignController.getSmsCampaignsAsync") getSmsCampaignsAsync

> Get list of sms campaigns


```java
void getSmsCampaignsAsync(final APICallBack<String> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
smsCampaign.getSmsCampaignsAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_sms_campaign_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.SmsCampaignController.getSmsCampaignAsync") getSmsCampaignAsync

> Get specific sms campaign


```java
void getSmsCampaignAsync(
        final int smsCampaignId,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| smsCampaignId |  ``` Required ```  | ID of SMS campaign to retrieve |


#### Example Usage

```java
int smsCampaignId = 233;
// Invoking the API call with sample inputs
smsCampaign.getSmsCampaignAsync(smsCampaignId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="post_letter_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.clicksend.controllers.PostLetterController") PostLetterController

### Get singleton instance

The singleton instance of the ``` PostLetterController ``` class can be accessed from the API Client.

```java
PostLetterController postLetter = client.getPostLetter();
```

### <a name="send_post_letter_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.PostLetterController.sendPostLetterAsync") sendPostLetterAsync

> Send post letter


```java
void sendPostLetterAsync(
        final PostLetter postLetter,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| postLetter |  ``` Required ```  | PostLetter model |


#### Example Usage

```java
try {
    PostLetter postLetter = new PostLetter();
    // Invoking the API call with sample inputs
    postLetter.sendPostLetterAsync(postLetter, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="calculate_price_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.PostLetterController.calculatePriceAsync") calculatePriceAsync

> Calculate post letter price


```java
void calculatePriceAsync(
        final PostLetter postLetter,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| postLetter |  ``` Required ```  | PostLetter model |


#### Example Usage

```java
try {
    PostLetter postLetter = new PostLetter();
    // Invoking the API call with sample inputs
    postLetter.calculatePriceAsync(postLetter, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_post_letter_history_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.PostLetterController.getPostLetterHistoryAsync") getPostLetterHistoryAsync

> Get all post letter history


```java
void getPostLetterHistoryAsync(final APICallBack<String> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
postLetter.getPostLetterHistoryAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="export_post_letter_history_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.PostLetterController.exportPostLetterHistoryAsync") exportPostLetterHistoryAsync

> export post letter history


```java
void exportPostLetterHistoryAsync(
        final String filename,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| filename |  ``` Required ```  | Filename to export to |


#### Example Usage

```java
String filename = "filename";
// Invoking the API call with sample inputs
postLetter.exportPostLetterHistoryAsync(filename, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="mms_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.clicksend.controllers.MMSController") MMSController

### Get singleton instance

The singleton instance of the ``` MMSController ``` class can be accessed from the API Client.

```java
MMSController mMS = client.getMMS();
```

### <a name="send_mms_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.MMSController.sendMMSAsync") sendMMSAsync

> TODO: Add a method description


```java
void sendMMSAsync(
        final MmsMessageCollection mmsMessages,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| mmsMessages |  ``` Required ```  | MmsMessageCollection model |


#### Example Usage

```java
try {
    MmsMessageCollection mmsMessages = new MmsMessageCollection();
    // Invoking the API call with sample inputs
    mMS.sendMMSAsync(mmsMessages, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_price_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.MMSController.getPriceAsync") getPriceAsync

> Get Price for MMS sent


```java
void getPriceAsync(
        final MmsMessageCollection mmsMessages,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| mmsMessages |  ``` Required ```  | MmsMessageCollection model |


#### Example Usage

```java
try {
    MmsMessageCollection mmsMessages = new MmsMessageCollection();
    // Invoking the API call with sample inputs
    mMS.getPriceAsync(mmsMessages, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

## <a name="upload_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.clicksend.controllers.UploadController") UploadController

### Get singleton instance

The singleton instance of the ``` UploadController ``` class can be accessed from the API Client.

```java
UploadController upload = client.getUpload();
```

### <a name="upload_file_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.UploadController.uploadFileAsync") uploadFileAsync

> Upload a file


```java
void uploadFileAsync(
        final File file,
        final String convert,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| file |  ``` Required ```  | The file to be uploaded |
| convert |  ``` Required ```  | The product that this file will be used with e.g. 'fax', 'mms', 'csv' or 'post' |


#### Example Usage

```java
File file = new File("PathToFile");
String convert = "convert";
// Invoking the API call with sample inputs
upload.uploadFileAsync(file, convert, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="upload_file_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.UploadController.uploadFileAsync") uploadFileAsync

> TODO: Add a method description


```java
void uploadFileAsync(
        final String content,
        final String convert,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| content |  ``` Required ```  | Base64-encoded file contents |
| convert |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String content = "content";
String convert = "convert";
// Invoking the API call with sample inputs
upload.uploadFileAsync(content, convert, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="post_direct_mail_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.clicksend.controllers.PostDirectMailController") PostDirectMailController

### Get singleton instance

The singleton instance of the ``` PostDirectMailController ``` class can be accessed from the API Client.

```java
PostDirectMailController postDirectMail = client.getPostDirectMail();
```

### <a name="send_campaign_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.PostDirectMailController.sendCampaignAsync") sendCampaignAsync

> TODO: Add a method description


```java
void sendCampaignAsync(
        final PostDirectMail postDirectMail,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| postDirectMail |  ``` Required ```  | PostDirectMail model |


#### Example Usage

```java
try {
    PostDirectMail postDirectMail = new PostDirectMail();
    // Invoking the API call with sample inputs
    postDirectMail.sendCampaignAsync(postDirectMail, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="location_search_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.PostDirectMailController.locationSearchAsync") locationSearchAsync

> Search for a location


```java
void locationSearchAsync(
        final String country,
        final String q,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| country |  ``` Required ```  | Country Code to search |
| q |  ``` Required ```  | Search term (e.g. post code, city name) |


#### Example Usage

```java
String country = "country";
String q = "q";
// Invoking the API call with sample inputs
postDirectMail.locationSearchAsync(country, q, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="calculate_price_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.PostDirectMailController.calculatePriceAsync") calculatePriceAsync

> Calculate direct mail campaign price


```java
void calculatePriceAsync(
        final PostDirectMail postDirectMail,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| postDirectMail |  ``` Required ```  | PostDirectMail model |


#### Example Usage

```java
try {
    PostDirectMail postDirectMail = new PostDirectMail();
    // Invoking the API call with sample inputs
    postDirectMail.calculatePriceAsync(postDirectMail, new APICallBack<String>() {
        public void onSuccess(HttpContext context, String response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="campaigns_async"></a>![Method: ](https://apidocs.io/img/method.png "com.clicksend.controllers.PostDirectMailController.campaignsAsync") campaignsAsync

> Get direct mail campaigns


```java
void campaignsAsync(final APICallBack<String> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
postDirectMail.campaignsAsync(new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)



