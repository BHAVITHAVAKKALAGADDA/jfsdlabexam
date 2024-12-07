package com.klef.jfsd.exam.model;

import javax.annotation.processing.Generated;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedVaue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    private String title;
    private String author;
    private String genre;
    private double price;
    private int publishedYear;

    // Getters and Setters
}
