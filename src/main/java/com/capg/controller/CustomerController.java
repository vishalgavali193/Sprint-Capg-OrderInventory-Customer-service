package com.capg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.capg.entity.Customer;
import com.capg.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping
    public List<Customer> getAll() {
        return service.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getById(@PathVariable Long id) {
        return service.getCustomer(id);
    }

    @PostMapping
    public Customer create(@RequestBody Customer c) {
        return service.createCustomer(c);
    }

    @PutMapping("/{id}")
    public Customer update(@PathVariable Long id, @RequestBody Customer c) {
        return service.updateCustomer(id, c);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteCustomer(id);
        return "Deleted";
    }

   
    @GetMapping("/validate/{id}")
    public boolean validate(@PathVariable Long id) {
        return service.validateCustomer(id);
    }
}