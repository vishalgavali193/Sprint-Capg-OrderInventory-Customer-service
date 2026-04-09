package com.capg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.capg.service.CustomerService;

@Controller
public class ViewController {

    private final CustomerService service;

    public ViewController(CustomerService service) {
        this.service = service;
    }

   
    @GetMapping("/")
    public String home() {
        return "index";
    }

    
    @GetMapping("/customers-ui")
    public String getCustomers(Model model) {
        model.addAttribute("customers", service.getAllCustomers());
        return "customers";
    }
}