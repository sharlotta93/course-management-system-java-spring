package com.codeclan.example.booking_system.controllers;

import com.codeclan.example.booking_system.models.Booking;
import com.codeclan.example.booking_system.repositories.BookingRepository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepo;

    @GetMapping(value = "/find/{date}")
    public List<Booking> getAllBookingsByDate(@PathVariable String date) {
        return bookingRepo.getBookingsByDate(date);
    }
}
