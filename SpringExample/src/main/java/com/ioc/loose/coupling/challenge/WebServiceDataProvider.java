package com.ioc.loose.coupling.challenge;

public class WebServiceDataProvider implements UserDataProvider{

    @Override
    public String getUserDetails(){
        return "Details fetched from Web Service";
    }
}