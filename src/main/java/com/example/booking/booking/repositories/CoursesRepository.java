package com.example.booking.booking.repositories;

import com.example.booking.booking.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepository extends JpaRepository<Course, Long> {


}
