package org.example.task2;

class BirthdayMailStrategy implements MailStrategy {
    private int ageThreshold = 16;

    @Override
    public String generateCode(Client client) {
        // Implementation for sending birthday greetings
        if (client.getAge() >= ageThreshold) {
            return client.getName() + " special offer for clients older than " + ageThreshold + " years!";
        } else {
            return client.getName() + " special offer for clients younger than " + ageThreshold + " years!";
        }
    }
}