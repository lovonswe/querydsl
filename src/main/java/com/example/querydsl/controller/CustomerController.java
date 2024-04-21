package com.example.querydsl.controller;

import com.example.querydsl.dto.CustomerDetailsDto;
import com.example.querydsl.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping
    public void addNewCustomer(@RequestBody CustomerDetailsDto customerDetails) {
        customerService.addNewCustomer(customerDetails);
    }
}
