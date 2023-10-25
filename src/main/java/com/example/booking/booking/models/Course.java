package com.example.booking.booking.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="courses")
public class Course {

    @Column(name="names")
    private String name;
    @Column(name="towns")
    private String town;
    @Column(name="starRatings")
    private double starRating;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JsonBackReference
    private List<Booking> bookings;

    public Course(String name, String town, double starRating) {
        this.name = name;
        this.town = town;
        this.starRating = starRating;
        this.bookings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public double getStarRating() {
        return starRating;
    }

    public void setStarRating(double starRating) {
        this.starRating = starRating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
