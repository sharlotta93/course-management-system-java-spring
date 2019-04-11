package com.codeclan.example.booking_system.components;

import com.codeclan.example.booking_system.models.Booking;
import com.codeclan.example.booking_system.models.Course;
import com.codeclan.example.booking_system.models.Customer;
import com.codeclan.example.booking_system.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.booking_system.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.booking_system.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepo;

    @Autowired
    BookingRepository bookingRepo;

    @Autowired
    CourseRepository courseRepo;

    public void run(ApplicationArguments args) {
        Customer customer = new Customer("Bob", "Newcastle", 32);
        customerRepo.save(customer);

        Customer customer2 = new Customer("Jackie", "Edinburgh", 26);
        customerRepo.save(customer2);

        Customer customer3 = new Customer("Annie", "Edinburgh", 44);
        customerRepo.save(customer3);


        Course course = new Course("Learn to love Spring", "Edinburgh", 3);
        courseRepo.save(course);

        Course course2 = new Course("Making progress in the worlds", "Glasgow", 5);
        courseRepo.save(course2);

        Booking booking = new Booking("12-12-2019", course, customer);
        bookingRepo.save(booking);

        Booking booking2 = new Booking("12-4-2019", course2, customer2);
        bookingRepo.save(booking2);

        Booking booking3 = new Booking("12-4-2019", course2, customer3);
        bookingRepo.save(booking3);
    }

}
