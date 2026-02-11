package com.bank.app.controller;

import com.bank.app.model.Customer;
import com.bank.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "/api/customers")
    public List<Customer> createCustomer(@RequestBody Customer customer){ // Accepts a JSON request to create a new
                                                                        // customer and returns the created customer.
        return customerService.createCustomer(customer);
    }

    @GetMapping("/api/customers")
    public void getAllCustomers() { // Returns a list of all customers.

    }
            ● GET /api/customers/{id}
    Returns a single customer by ID.
            ● PUT /api/customers/{id}
    Updates an existing customer’s details and returns the updated customer.
● DELETE /api/customers/{id}
    Deletes a customer and returns a confirmation message.
}
