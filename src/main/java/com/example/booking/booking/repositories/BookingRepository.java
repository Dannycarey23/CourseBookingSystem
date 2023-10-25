package com.example.booking.booking.repositories;

import com.example.booking.booking.models.Booking;
import com.example.booking.booking.models.Course;
import com.example.booking.booking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

//    List<Customer> findCourseByCustomersId(Long id);

//    List<Booking> findCustomersByCourse(Course course);

}
