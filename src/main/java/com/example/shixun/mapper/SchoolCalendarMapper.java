package com.example.shixun.mapper;

import com.example.shixun.entity.SchoolCalendar;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SchoolCalendarMapper {
    @Select("Select * from SchoolCalendar" )
    List<SchoolCalendar> SelectAll();
}
