package com.codeclan.example.booking_system.repositories.CustomerRepository;

import com.codeclan.example.booking_system.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom{

    List<Customer> getAllCustomersByCourse(Long course_id);

    List<Customer> getAllCustomersofAgeByTownAndCourse(String town, int age, Long id);
}
