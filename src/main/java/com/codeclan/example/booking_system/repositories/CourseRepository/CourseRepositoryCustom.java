package com.codeclan.example.booking_system.repositories.CourseRepository;

import com.codeclan.example.booking_system.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> findAllCustomersByCourse(Long id);
}
