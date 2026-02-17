package com.bank.app.controller;

import com.bank.app.model.Customer;
import com.bank.app.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity<String> createCustomer(@RequestBody Customer customer){ // Accepts a JSON request to create a new
                                                                        // customer and returns the created customer.
        customerService.createCustomer(customer);
        return new ResponseEntity<>("Customer created successfully!",HttpStatus.CREATED);
//         return ResponseEntity.ok(customerService.createCustomer(customer));

    }

    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers() { // Returns a list of all customers.
        return ResponseEntity.ok(customerService.getAllCustomers()) ;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable Long id) { // Returns a single customer by ID.
        return ResponseEntity.ok(customerService.getCustomerById(id));

//        return customerService.getCustomerById(id)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());

    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer, @PathVariable Long id) { // Updates an existing customer’s details and returns the updated customer.
        try{
            return ResponseEntity.ok(customerService.updateCustomer(customer, id));
        }catch(RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable Long id) { // Deletes a customer and returns a confirmation message.
        try{
            customerService.deleteCustomer(id);
            return ResponseEntity.ok("Customer deleted successfully");
        }catch(RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }
}
