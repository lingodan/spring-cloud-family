package com.lingodan.school.consumer.remote;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "PROVIDER")
public interface AnotherSimpleFacade {

    @RequestMapping(value = "/hello/{id}",method = RequestMethod.GET)
    String returnHello(@PathVariable("id") String id);

    @RequestMapping(value = "/post",method = RequestMethod.POST)
    String returnPost(@RequestBody JSONObject req);
}
