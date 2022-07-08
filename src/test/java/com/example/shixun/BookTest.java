package com.example.shixun;

import com.example.shixun.entity.Book;
import com.example.shixun.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class BookTest {
    @Autowired
    BookMapper bookMapper;
   // @Test
    void insertBook(){
        Book book =new Book();
        book.setBook_name("mysql");
        book.setBook_number(78);
        book.setAuthor("jsw");
        book.setIsbn(789464);
        book.setPrice(90);
        bookMapper.insertBook(book);
    }

}
