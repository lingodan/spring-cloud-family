package com.lingodan.school.provider.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
public class SimpleController {

    @GetMapping(value = "/hello/{id}")
    public String returnHello(@PathVariable(value = "id") String id){
        System.out.println("Return Hello is Ok! "+id);
        return "Hello Spring-Cloud Family";
    }

    @PostMapping(value= "/post")
    public String returnPost(@RequestBody JSONObject req){

        System.out.println("hello");
        return "Hello";

    }

}
