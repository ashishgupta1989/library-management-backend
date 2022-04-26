package com.epam.kata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Reader {

    @Id
    @GeneratedValue
    @Column(name = "Reader_id")
    private Integer readerId;

    @Column(name="Full_Name")
    private String fullName;

    private Integer phoneNumber;
    private Address address;
    private String email;
}
