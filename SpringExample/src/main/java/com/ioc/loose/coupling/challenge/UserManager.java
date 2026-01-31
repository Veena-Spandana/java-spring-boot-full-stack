package com.ioc.loose.coupling.challenge;

public class UserManager {

    private UserDataProvider userDataProvider;

    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public void getInfo(){
        System.out.println(userDataProvider.getUserDetails());
    }
}

