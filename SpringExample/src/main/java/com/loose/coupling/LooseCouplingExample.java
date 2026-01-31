package com.loose.coupling;


public class LooseCouplingExample {
    public static void main(String[] args){
        UserDataProvider userDatabaseProvider = new UserDatabaseProvider();
        UserManager userDatabaseWithDB = new UserManager(userDatabaseProvider);
        System.out.println(userDatabaseWithDB.getUserInfo());

        UserDataProvider webServiceDataProvider = new WebServiceDataProvider();
        UserManager userDatabaseWithWebService = new UserManager(webServiceDataProvider);
        System.out.println(userDatabaseWithWebService.getUserInfo());

        UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
        UserManager userManagerWithNewDB = new UserManager(newDatabaseProvider);
        System.out.println(userManagerWithNewDB.getUserInfo());
    }
}
