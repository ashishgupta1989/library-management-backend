package com.epam.kata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Book {
    @Id
    @Column(name="Book_Id")
    @GeneratedValue()
    private Integer bookId;

    @Column
    private String bookName;
    @Column
    private String author;
    @Column
    private String publisher;
    @Column
    private String bookGenres;
    @Column
    private Integer count;



}
