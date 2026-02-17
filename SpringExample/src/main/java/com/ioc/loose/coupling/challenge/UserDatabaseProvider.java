package com.ioc.loose.coupling.challenge;

public class UserDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails(){
        return "Details fetched from User Database";
    }
}