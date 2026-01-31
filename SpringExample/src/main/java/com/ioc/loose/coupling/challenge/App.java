package com.ioc.loose.coupling.challenge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIocLooseCouplingChallenge.xml");
        UserManager userManagerWithUserDatabaseProvider = (UserManager) context.getBean("userManagerWithUserDatabaseProvider");
        userManagerWithUserDatabaseProvider.getInfo();

        UserManager userManagerWithWebServiceDataProvider = (UserManager) context.getBean("userManagerWithWebServiceDataProvider");
        userManagerWithWebServiceDataProvider.getInfo();

        UserManager userManagerWithNewDatabaseProvider = (UserManager) context.getBean("userManagerWithNewDatabaseProvider");
        userManagerWithNewDatabaseProvider.getInfo();
    }
}

