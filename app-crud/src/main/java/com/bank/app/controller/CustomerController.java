package com.bank.app.controller;

import com.bank.app.model.Customer;
import com.bank.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/api/customers")
    public String createCustomer(@RequestBody Customer customer){ // Accepts a JSON request to create a new
                                                                        // customer and returns the created customer.
        String status = customerService.createCustomer(customer);
        return new ResponseEntity<>(HttpStatus.CREATED, "Customer created successfully!");

    }

    @GetMapping("/api/customers")
    public void getAllCustomers() { // Returns a list of all customers.
        customerService.getAllCustomers();
    }
    @GetMapping("/api/customers/{id}")
    public void getCustomerById(@PathVariable Long id) { // Returns a single customer by ID.
        customerService.getCustomerById(id);

    }

    @PutMapping("/api/customers/{id}")
    public void updateCustomer(@RequestBody Customer customer, @PathVariable Long id) { // Updates an existing customer’s details and returns the updated customer.
//        Customer updatedData = customerService.updateCustomer(customer,id);
//        String status =

    }

    @DeleteMapping("/api/customers/{id}")
    public void deleteCustomer(@PathVariable Long id) { // Deletes a customer and returns a confirmation message.

    }
}
