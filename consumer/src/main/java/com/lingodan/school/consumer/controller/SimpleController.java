package com.lingodan.school.consumer.controller;

import com.lingodan.school.consumer.biz.SimpleBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @Autowired
    private SimpleBiz simpleBiz;

//    @GetMapping(value = "/hello/{id}")
//    public String returnHello(@PathVariable(value = "id") String id) {
//        return simpleBiz.returnSimple(id);
//    }
//
//    @GetMapping(value = "/post")
//    public String returnPost(){
//        return simpleBiz.returnPost();
//    }

    @GetMapping(value = "/an/hello/{id}")
    public String returnHello1(@PathVariable(value = "id") String id) {
        return simpleBiz.returnSimple1(id);
    }

    @GetMapping(value = "/an/post")
    public String returnPost1(){
        return simpleBiz.returnPost1();
    }

}
