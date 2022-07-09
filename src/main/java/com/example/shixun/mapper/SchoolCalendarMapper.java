package com.example.shixun.mapper;

import com.example.shixun.entity.SchoolCalendar;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SchoolCalendarMapper {
    @Select("Select * from SchoolCalendar" )
    List<SchoolCalendar> SelectAll();


    @Insert("insert into SchoolCalendar(end,start,title) values(#{end},#{start},#{title});")
    void insertEvent(SchoolCalendar schoolCalendar);
}
