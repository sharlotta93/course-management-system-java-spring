package com.codeclan.example.booking_system.controllers;

import com.codeclan.example.booking_system.models.Course;
import com.codeclan.example.booking_system.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepo;



    @GetMapping(value = "/rating/{rating}")
    public List<Course> getCoursesByRating(@PathVariable int rating) {
        return courseRepo.findCourseByRating(rating);
    }

    @GetMapping(value = "/customer/{id}")
    public List<Course> getAllCoursesByCustomer(@PathVariable Long id){
        return courseRepo.findAllCustomersByCourse(id);
    }



}


