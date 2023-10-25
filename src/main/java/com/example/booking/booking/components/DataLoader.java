package com.example.booking.booking.components;

import com.example.booking.booking.models.Booking;
import com.example.booking.booking.models.Course;
import com.example.booking.booking.models.Customer;
import com.example.booking.booking.repositories.BookingRepository;
import com.example.booking.booking.repositories.CoursesRepository;
import com.example.booking.booking.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class DataLoader {

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
        Course course2 = new Course("Clowning", "Riverside Island", 3.8);
        Course course3 = new Course("Trapeze", "Oakland Island", 4.9);
        Course course4 = new Course("Juggling", "Bristol Island", 4.2);
        Course course5 = new Course("Animal Taming", "Manchester Island", 4.6);

        Customer customer1 = new Customer("John Doe", "Springfield", 30);
        Customer customer2 = new Customer("Jane Smith", "Riverside", 25);
        Customer customer3 = new Customer("Michael Johnson", "Oakland", 40);
        Customer customer4 = new Customer("Emily Williams", "Bristol", 35);
        Customer customer5 = new Customer("William Brown", "Manchester", 45);

        Booking booking1 = new Booking("25th October");
        booking1.getCourses().add(course1);
        booking1.getCustomers().add(customer1);

        Booking booking2 = new Booking("31st October");
        booking2.getCourses().add(course2);
        booking2.getCustomers().add(customer2);

        Booking booking3 = new Booking("5th November");
        booking3.getCourses().add(course3);
        booking3.getCustomers().add(customer3);
    }


}
