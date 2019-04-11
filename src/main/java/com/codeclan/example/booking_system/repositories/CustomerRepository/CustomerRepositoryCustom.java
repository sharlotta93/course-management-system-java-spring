package com.codeclan.example.booking_system.repositories.CustomerRepository;

import com.codeclan.example.booking_system.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> getAllCustomersByCourse(Long course_id);
}
