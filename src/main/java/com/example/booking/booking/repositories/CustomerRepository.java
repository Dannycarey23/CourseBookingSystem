package com.example.booking.booking.repositories;

import com.example.booking.booking.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

//List<Customer> findByCourseId (long id);

    List<Customer> findByBookingCourseId(Long id);



}
