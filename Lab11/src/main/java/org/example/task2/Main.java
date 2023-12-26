package org.example.task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

public class Main {
    public static void main(String[] args) throws MailjetSocketTimeoutException, MailjetException {
        Client client1 = Client.builder().name("Anna").age(15).sex("Female").email("123@gmail.com").build();
        Client client2 = Client.builder().name("Anna").age(20).sex("Female").email("456@gmail.com").build();
        MailSender mailSender = new MailSender();
        MailBox mailBox = new MailBox();

        mailBox.addMailInfo(new MailInfo(client1));
        mailBox.addMailInfo(new MailInfo(client2));

        mailSender.sendMail(new MailInfo(client1));

        mailBox.sendAll();
    }
}
