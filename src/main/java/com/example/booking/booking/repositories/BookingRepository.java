package com.example.booking.booking.repositories;

import com.example.booking.booking.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {


}
