package org.example.task1;
import java.time.LocalDate;

public class MyFacebookUser implements User{
    private FacebookUser facebookUser;
    public MyFacebookUser(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    @Override
    public String getEmail() {
        return facebookUser.getUserMaik();
    }

    @Override
    public String getCountry() {
        return facebookUser.getCountry();
    }

    @Override
    public LocalDate getLastActiveData() {
        return facebookUser.getLastActiveTime().toLocalDate();
    }
}
