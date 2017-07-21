package com.demo.clicksend;

import com.clicksend.ClickSendClient;
import com.clicksend.controllers.VoiceController;
import com.clicksend.models.VoiceMessage;
import com.clicksend.models.VoiceMessageCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * https://market.mashape.com/clicksend/clicksend-sms#send-voice-tts
 */
public class VoiceSample extends Base {

    public static void main(String[] args) throws Throwable {
        ClickSendClient clickSendClient = new ClickSendClient(USERNAME, API_KEY);
        VoiceController voiceController = clickSendClient.getVoice();

        List<VoiceMessage> messages = new ArrayList<VoiceMessage>();
        messages.add(createVoiceMessage());

        VoiceMessageCollection voiceMessageCollection = new VoiceMessageCollection();
        voiceMessageCollection.setMessages(messages);
        String response = voiceController.sendVoice(voiceMessageCollection);
        System.out.println(response);
    }

    private static VoiceMessage createVoiceMessage() {
        VoiceMessage voiceMessage = new VoiceMessage();
        voiceMessage.setSource("JavaSDK");
        voiceMessage.setBody("This is test");
        voiceMessage.setTo("+61411111111");
        voiceMessage.setLang("en-au"); // http://docs.clicksend.apiary.io/#reference/voice    - Allowed Languages
        voiceMessage.setVoice("female"); // http://docs.clicksend.apiary.io/#reference/voice  - Allowed Languages
        voiceMessage.setSchedule(0);
        voiceMessage.setCustomString(UUID.randomUUID().toString());
        return voiceMessage;
    }
}
