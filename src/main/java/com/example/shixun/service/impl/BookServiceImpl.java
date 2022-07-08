package com.example.shixun.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.shixun.mapper.BookMapper;
import com.example.shixun.service.BookSevice;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImpl implements BookSevice {
    @Autowired
    BookMapper bookMapper;

}
