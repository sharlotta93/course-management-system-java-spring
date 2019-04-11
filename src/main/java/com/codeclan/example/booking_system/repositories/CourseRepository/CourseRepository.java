package com.codeclan.example.booking_system.repositories.CourseRepository;

import com.codeclan.example.booking_system.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
    List<Course> findCourseByRating(int rating);

    List<Course> findAllCustomersByCourse(Long id);
}
