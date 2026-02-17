package com.bank.app.service;

import com.bank.app.model.Customer;
import com.bank.app.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();

    }

    public Optional<Customer> getCustomerById(Long id){
        return customerRepository.findById(id);

    }

    public Customer updateCustomer(Customer updatedCustomer, Long id){
        return customerRepository.findById(id)
                .map(existing -> {
                    existing.setFirstName(updatedCustomer.getFirstName());
                    existing.setLastName(updatedCustomer.getLastName());
                    existing.setEmail(updatedCustomer.getEmail());
                    existing.setPhoneNumber(updatedCustomer.getPhoneNumber());
                    return customerRepository.save(existing);
                })
                .orElseThrow(() -> new RuntimeException("Customer not found with id:" + id));
    }

    public void deleteCustomer(Long id){
        if(!customerRepository.existsById(id)){
            throw new RuntimeException("Customer not found with id:" + id);
        }
        customerRepository.deleteById(id);


    }

}
