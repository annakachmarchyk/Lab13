package org.example.task2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailInfo {
    private Client client;
    private String mailCode;

    public MailInfo(Client client) {
        this.client = client;
    }

    public String getMailStrategyByCode(String mailCode, Client client) {
        switch (mailCode) {
            case "birthday":
                return new BirthdayMailStrategy().generateCode(client);
            case "gift":
                return new GiftMailStrategy().generateCode(client);
            default:
                return null;
        }
    }

}