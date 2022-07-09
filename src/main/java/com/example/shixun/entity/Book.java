package com.example.shixun.entity;

import lombok.Data;
import org.springframework.stereotype.Repository;

@Data

public class Book {
    private int id;
    int isbn;
    String book_name;
    String book_publish;
    String author;
    int book_number;
    int price;
}
