package com.example.shixun.controller;

import com.example.shixun.entity.Test;
import com.example.shixun.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestMapper testMapper;
    @PostMapping("/test")
    void testInsert(@RequestBody Test test){
        testMapper.inset(test);
    }
}
