package com.demo.clicksend;

import com.clicksend.ClickSendClient;
import com.clicksend.controllers.FaxController;
import com.clicksend.models.FaxMessage;
import com.clicksend.models.FaxMessageCollection;

import java.util.Arrays;
import java.util.UUID;

public class FaxSample extends Base {

    public static void main(String[] args) throws Throwable {
        ClickSendClient clickSendClient = new ClickSendClient(USERNAME, API_KEY);
        FaxController faxController = clickSendClient.getFax();

        String fileUrl = "https://s3-ap-southeast-2.amazonaws.com/clicksend-api-downloads/_public/_examples/document.pdf";
        FaxMessageCollection collection = new FaxMessageCollection();
        collection.setFileUrl(fileUrl);
        collection.setMessages(Arrays.asList(createFaxMessage()));
        String response = faxController.sendFax(collection);
        System.out.println(response);
    }

    private static FaxMessage createFaxMessage() {
        FaxMessage faxMessage = new FaxMessage();
        faxMessage.setSource("JavaSDK");
        faxMessage.setTo("+61261111111");
        faxMessage.setSchedule(1436874701);
        faxMessage.setCustomString(UUID.randomUUID().toString());
        faxMessage.setCountry("AF");
        faxMessage.setFromEmail("will@smith.com");
        return faxMessage;
    }
}
