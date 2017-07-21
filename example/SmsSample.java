package com.demo.clicksend;

import com.clicksend.ClickSendClient;
import com.clicksend.controllers.SMSController;
import com.clicksend.models.SmsMessage;
import com.clicksend.models.SmsMessageCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SmsSample extends Base {

    public static void main(String[] args) throws Throwable {
        ClickSendClient clickSendClient = new ClickSendClient(USERNAME, API_KEY);
        SMSController smsController = clickSendClient.getSMS();
        SmsMessageCollection messageCollection = new SmsMessageCollection();
        List<SmsMessage> messages = new ArrayList<SmsMessage>();
        messages.add(createSMSMessage());
        messageCollection.setMessages(messages);

        String response = smsController.sendSms(messageCollection);
        System.out.println(response);
    }

    private static SmsMessage createSMSMessage() {
        SmsMessage smsMessage = new SmsMessage();
        smsMessage.setSource("JavaSDK");
        smsMessage.setBody("This is test");
        smsMessage.setTo("+61411111111");
        smsMessage.setCountry("AU");
        smsMessage.setCustomString(UUID.randomUUID().toString());
        return smsMessage;
    }
}
