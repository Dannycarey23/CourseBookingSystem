package com.example.booking.booking;

import com.example.booking.booking.models.Customer;
import com.example.booking.booking.repositories.BookingRepository;
import com.example.booking.booking.repositories.CoursesRepository;
import com.example.booking.booking.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BookingApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CoursesRepository coursesRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canFindAllCustomers(){
		List<Customer> customers = customerRepository.findAll();
		assertEquals(6, customers.size());
	}
}


