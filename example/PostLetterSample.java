package com.demo.clicksend;

import com.clicksend.ClickSendClient;
import com.clicksend.controllers.PostLetterController;
import com.clicksend.models.PostLetter;
import com.clicksend.models.PostRecipient;
import com.fasterxml.jackson.core.JsonProcessingException;

import static java.util.Arrays.asList;

public class PostLetterSample extends Base {

    public static void main(String[] args) throws Throwable {
        ClickSendClient clickSendClient = new ClickSendClient(USERNAME, API_KEY);
        PostLetterController postLetterController = clickSendClient.getPostLetter();
        String response = postLetterController.sendPostLetter(createPostLetter());
        System.out.println(response);
    }

    public static PostLetter createPostLetter() throws JsonProcessingException {
        PostLetter postLetter = new PostLetter();
        postLetter.setFileUrl("https://s3-ap-southeast-2.amazonaws.com/clicksend-api-downloads/_public/_examples/document.pdf");
        postLetter.setTemplateUsed(true);
        postLetter.setColour(true);
        postLetter.setDuplex(false);

        PostRecipient receipient = new PostRecipient();
        receipient.setAddressName("Christine Jacobs");
        receipient.setAddressLine1("Blk 32 Lot 80 Philadelphia St");
        receipient.setAddressLine2("");
        receipient.setAddressCity("General Santos");
        receipient.setAddressState("Visayas");
        receipient.setAddressPostalCode(3255);
        receipient.setAddressCountry("PH");
        receipient.setReturnAddressId(1);
        receipient.setSchedule(0);

        postLetter.setRecipients(asList(receipient));

        return postLetter;
    }
}
