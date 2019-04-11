package com.codeclan.example.booking_system.repositories.CustomerRepository;

import com.codeclan.example.booking_system.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
