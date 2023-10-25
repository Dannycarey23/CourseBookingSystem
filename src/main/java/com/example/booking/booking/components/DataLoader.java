package com.example.booking.booking.components;

import com.example.booking.booking.models.Booking;
import com.example.booking.booking.models.Course;
import com.example.booking.booking.models.Customer;
import com.example.booking.booking.repositories.BookingRepository;
import com.example.booking.booking.repositories.CoursesRepository;
import com.example.booking.booking.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Profile("!test")
// @Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CoursesRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        Course course1 = new Course("Acrobatics", "Springfield Island", 4.5);
        courseRepository.save(course1);
        Course course2 = new Course("Clowning", "Riverside Island", 3.8);
        courseRepository.save(course2);
        Course course3 = new Course("Trapeze", "Oakland Island", 4.9);
        courseRepository.save(course3);
        Course course4 = new Course("Juggling", "Bristol Island", 4.2);
        courseRepository.save(course4);
        Course course5 = new Course("Animal Taming", "Manchester Island", 4.6);
        courseRepository.save(course5);
        Customer customer1 = new Customer("John Doe", "Springfield", 30);
        customerRepository.save(customer1);
        Customer customer2 = new Customer("Jane Smith", "Riverside", 25);
        customerRepository.save(customer2);
        Customer customer3 = new Customer("Michael Johnson", "Oakland", 40);
        customerRepository.save(customer3);
        Customer customer4 = new Customer("Emily Williams", "Bristol", 35);
        customerRepository.save(customer4);
        Customer customer5 = new Customer("William Brown", "Manchester", 45);
        customerRepository.save(customer5);


        Booking booking1 = new Booking("25th October", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("26th October", course2, customer2);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("27th October", course3, customer3);
        bookingRepository.save(booking3);
    }


}
