package com.epam.kata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    @Column(name="id")
    @GeneratedValue
    private Integer id;

    private String houseName;
    private String streetName;
    private String areaName;
    private Integer pin;
    private String city;
    private String country;

}
