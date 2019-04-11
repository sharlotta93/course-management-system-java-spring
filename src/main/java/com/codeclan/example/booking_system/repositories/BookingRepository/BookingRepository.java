package com.codeclan.example.booking_system.repositories.BookingRepository;

import com.codeclan.example.booking_system.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> getBookingsByDate(String date);


}
