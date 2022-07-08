package com.example.shixun.controller;

import com.example.shixun.entity.SchoolCalendar;
import com.example.shixun.mapper.SchoolCalendarMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller

@Slf4j
public class TitleController {
    @Autowired
    SchoolCalendarMapper schoolCalendarMapper;

    @GetMapping("/title")
    @ResponseBody
    List<SchoolCalendar> getTilt() {
        return schoolCalendarMapper.SelectAll();

    }
}
