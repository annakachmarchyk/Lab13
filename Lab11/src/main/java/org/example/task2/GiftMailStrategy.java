package org.example.task2;

class GiftMailStrategy implements MailStrategy {
    @Override
    public String generateCode(Client client) {
            return client.getName() + " exclusive gift for " + client.getSex() + " clients!";
        }
}