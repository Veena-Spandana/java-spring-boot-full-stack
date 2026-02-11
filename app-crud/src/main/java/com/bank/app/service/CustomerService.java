package com.bank.app.service;

import com.bank.app.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    List<Customer> customers = new ArrayList<>();
    public List<Customer> createCustomer(Customer customer){
        customers.add(customer);
        return customers;
    }

    public void getAllCustomers(){

    }

    public void getCustomerById(){

    }

    public void updateCustomer(){

    }

    public void deleteCustomer(){

    }

}
