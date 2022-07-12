package com.example.shixun.controller;

import com.example.shixun.entity.Worker;
import com.example.shixun.mapper.WorkerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class WorkerController {

    @Autowired
    WorkerMapper workerMapper;
    private Worker worker;


    @ResponseBody
    @RequestMapping("/worker")
    List<Worker> SW(){
        return workerMapper.selectWorker();
    }


    @PostMapping("/worker/update")
    void updateWorker(@RequestBody Worker worker){
        workerMapper.updateWorker(worker);
    }



    @PostMapping("/worker/add")
    void addWorker(@RequestBody Worker worker){
        workerMapper.insertWorker(worker);
    }

    @PostMapping("worker/del")
    void delWorker(@RequestBody Worker worker){
        workerMapper.deleteWorker(worker);
    }
    @RequestMapping("/worker1")
    String sw(){
        return "worker";
    }

    @GetMapping("/worker/order")
    List<Worker> or(){
        return workerMapper.orderByP();
    }
}