package com.example.shixun.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.shixun.entity.Worker;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface WorkerMapper extends BaseMapper<Worker> {
    @Select("select * from Worker")
    List<Worker> selectWorker();
    @Insert("insert into Worker(name,job_number,xi_bie,age,bu_men,dian_hua,product) values(#{name},#{job_number},#{xi_bie},#{age},#{bu_men},#{dian_hua},#{product});")
    void insertWorker(Worker worker);

    @Update("update Worker  set name=#{name},  job_number=#{job_number},xi_bie=#{xi_bie},age=#{age},bu_men=#{bu_men},dian_hua=#{dian_hua},product=#{product} where job_number=#{job_number};")
    void updateWorker(Worker worker);


    @Delete(" delete from Worker where job_number=#{job_number};")
    void deleteWorker(Worker  worker);


}
