package com.example.shixun.controller;

import com.example.shixun.entity.Book;
import com.example.shixun.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookMapper bookMapper;

    @PostMapping("/book/cre")
    void creBook(@RequestBody Book book){
        bookMapper.insertBook(book);
    }
    @GetMapping("/book/getAll")
    List<Book> getAllBook(){
        return bookMapper.selectAll();
    }

    @PostMapping("book/up")
    void upB(@RequestBody Book book){
        bookMapper.updateB(book);

    }

    @PostMapping("/book/del")
    void delB(@RequestBody Book book){
        bookMapper.delB(book);
    }
    @GetMapping("/book/order")
    List<Book> orderByBook(){
        return bookMapper.orderByPrice();
    }




}
