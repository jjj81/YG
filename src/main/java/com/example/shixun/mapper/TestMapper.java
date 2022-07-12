package com.example.shixun.mapper;

import com.example.shixun.entity.Test;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    @Insert("insert into t1(t2) values(#{t2});")
    void inset(Test test);
}
