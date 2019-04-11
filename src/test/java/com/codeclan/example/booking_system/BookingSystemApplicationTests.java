package com.codeclan.example.booking_system;

import com.codeclan.example.booking_system.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.booking_system.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.booking_system.repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingSystemApplicationTests {


	@Test
	public void contextLoads() {
	}

	@Autowired
	CustomerRepository customerRepo;

	@Autowired
	BookingRepository bookingRepo;

	@Autowired
	CourseRepository courseRepo;

}
