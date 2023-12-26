package org.example.task1;
import java.time.LocalDate;

public class MyTwitterUser implements User{
    private TwitterUser twitterUser;
    public MyTwitterUser(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }

    @Override
    public String getEmail() {
        return twitterUser.getUserMaik();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }

    @Override
    public LocalDate getLastActiveData() {
        return twitterUser.getLastActiveTime().toLocalDate();
    }
}
