package com.loose.coupling;

public class WebServiceDataProvider implements UserDataProvider{

    public String getUserDetails(){
        return "User Details fetched from Web Service";
    }
}

