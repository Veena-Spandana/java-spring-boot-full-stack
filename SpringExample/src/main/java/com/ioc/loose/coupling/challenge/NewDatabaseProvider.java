package com.ioc.loose.coupling.challenge;

public class NewDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails(){
        return "User Details fetched from New Database";
    }
}
