package com.example.booking.booking.models;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Column(name = "names")
    private String name;
    @Column(name = "towns")
    private String town;
    @Column(name = "ages")
    private int age;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Customer(String name, String town, int age) {
        this.name = name;
        this.town = town;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
