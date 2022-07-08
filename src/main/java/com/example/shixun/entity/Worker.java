package com.example.shixun.entity;

import lombok.Data;
import org.springframework.stereotype.Repository;

@Data
@Repository
public class Worker {
    String name;
    String job_number;
    String xi_bie;
    String age;
    String bu_men;
    String dian_hua;
    String product;
}
