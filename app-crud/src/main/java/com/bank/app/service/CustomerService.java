package com.bank.app.service;

import com.bank.app.model.Customer;
import com.bank.app.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public String createCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public void getAllCustomers(){
//        customers.

    }

    public String getCustomerById(Long id){
        customers.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst().orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,"Customer Id not found"));

        return "Customer";

    }

    public Customer updateCustomer(Customer customer, Long id){
        Customer customerDetails =  customers.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst().orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,"Customer not found"));

        customerDetails.setFirstName(customer.getFirstName());
        customerDetails.setLastName(customer.getLastName());
        customerDetails.setEmail(customer.getEmail());
        customerDetails.setPhoneNumber(customer.getPhoneNumber());
        return customerDetails;

    }

    public void deleteCustomer(Long id){
        Customer deleteCustomer = customers.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst().orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,"Customer not found"));


    }

}
