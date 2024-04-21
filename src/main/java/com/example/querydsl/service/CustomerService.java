package com.example.querydsl.service;

import com.example.querydsl.dto.CustomerDetailsDto;
import com.example.querydsl.model.oneToOne.unidirectional.Customer;
import com.example.querydsl.model.oneToOne.unidirectional.CustomerAddress;
import com.example.querydsl.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public void addNewCustomer(CustomerDetailsDto customerDetails) {
        Customer customer = mapCustomerDetailsToCustomer(customerDetails);
        customerRepository.save(customer);
    }

    public Customer mapCustomerDetailsToCustomer(CustomerDetailsDto customerDetails){
        CustomerAddress address = new CustomerAddress();
        address.setDistrict(customerDetails.getDistrict());
        address.setThana(customerDetails.getThana());
        address.setRoad(customerDetails.getRoad());
        address.setHouse(customerDetails.getHouse());

        Customer customer = new Customer();
        customer.setName(customerDetails.getName());
        customer.setPhone(customerDetails.getPhone());
        customer.setAddress(address);

        return customer;
    }
}
