package com.demo.clicksend;

import com.clicksend.ClickSendClient;
import com.clicksend.controllers.PostPostcardController;
import com.clicksend.models.PostPostcard;
import com.clicksend.models.PostRecipient;

import static java.util.Arrays.asList;

/**
 * Created by Sunil Gulabani on 11-07-2017.
 */
public class PostCardSample extends Base {

    public static void main(String[] args) throws Throwable {
        ClickSendClient clickSendClient = new ClickSendClient(USERNAME, API_KEY);
        PostPostcardController postcard = clickSendClient.getPostPostcard();
        String response = postcard.sendPostcard(createPostCard());
        System.out.println(response);
        System.exit(0);
    }

    private static PostPostcard createPostCard() {
        PostPostcard postPostcard = new PostPostcard();
        postPostcard.setFileUrls(asList("https://s3-ap-southeast-2.amazonaws.com/clicksend-api-downloads/_public/_examples/document.pdf"));

        PostRecipient recipient = new PostRecipient();
        recipient.setAddressName("Christine Jacobs");
        recipient.setAddressLine1("Blk 32 Lot 80 Philadelphia St");
        recipient.setAddressLine2("");
        recipient.setAddressCity("General Santos");
        recipient.setAddressState("Visayas");
        recipient.setAddressPostalCode(3255);
        recipient.setAddressCountry("PH");
        recipient.setReturnAddressId(1);
        recipient.setSchedule(0);

        postPostcard.setRecipients(asList(recipient));
        return postPostcard;
    }
}

