package org.example.task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Random;

public class MailSender {
    public static void sendMail(MailInfo mailInfo) throws MailjetException, MailjetSocketTimeoutException {
        MailjetClient mailClient;
        Client client;
        MailjetRequest request;
        MailjetResponse response;
        Random rand = new Random();
        client = mailInfo.getClient();
        mailClient = new MailjetClient("", "", new ClientOptions("v3.1"));
        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", "123@gmail.com")
                                        .put("Name", "Anna"))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", mailInfo.getClient().getEmail())
                                                .put("Name", mailInfo.getClient().getName())))
                                .put(Emailv31.Message.SUBJECT, "SPECIAL MAIL")
                                .put(Emailv31.Message.TEXTPART, "Email")
                                .put(Emailv31.Message.HTMLPART, mailInfo.getMailStrategyByCode(getRandomString("gift", "birthday"), client))));


        response = mailClient.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }

    private static String getRandomString(String string1, String string2) {
        Random random = new Random();
        int randomNumber = random.nextInt(2); // Generates a random email type (kind of a spam)

        return (randomNumber == 0) ? string1 : string2;
    }
}
