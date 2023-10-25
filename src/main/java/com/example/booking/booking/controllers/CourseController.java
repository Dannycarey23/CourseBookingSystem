package com.example.booking.booking.controllers;

import com.example.booking.booking.models.Course;
import com.example.booking.booking.models.Customer;
import com.example.booking.booking.repositories.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
class CourseController {
    @Autowired
    CoursesRepository coursesRepository;

    @GetMapping(value="/courses")
    public ResponseEntity<List<Course>> getAllCourses(){
        return new ResponseEntity<>(coursesRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/courses/{id}")
    public Optional<Course> getCourseById(@PathVariable Long id){
        return coursesRepository.findById(id);
    }

//    @GetMapping(value="/courses/")
}
