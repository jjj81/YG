package com.example.shixun.entity;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.sql.Date;

@Data
public class SchoolCalendar {
    Date start;
    Date end;
    String title;
}
