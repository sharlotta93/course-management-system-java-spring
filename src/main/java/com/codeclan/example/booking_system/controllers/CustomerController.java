package com.codeclan.example.booking_system.controllers;

import com.codeclan.example.booking_system.models.Customer;
import com.codeclan.example.booking_system.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepo;

    @GetMapping(value = "course/{id}")
    public List<Customer> getAllCustomerForACourse(@PathVariable Long id) {
        return customerRepo.getAllCustomersByCourse(id);
    }

    @GetMapping(value = "age/{age}/town/{town}/course/{id}")
    public List<Customer> getAllCustomerForACourseByAgeAndTown(@PathVariable  String town,@PathVariable int age, @PathVariable Long id ) {
        return customerRepo.getAllCustomersofAgeByTownAndCourse(town, age, id);
    }
}
