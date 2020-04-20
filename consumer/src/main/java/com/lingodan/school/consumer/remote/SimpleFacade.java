package com.lingodan.school.consumer.remote;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "provider",fallback = SimpleFacadeFallback.class)
public interface SimpleFacade {

    @RequestMapping(value = "/hello/{id}",method = RequestMethod.GET)
    public String returnHello(@PathVariable("id") String id);

    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public String returnPost(@RequestParam JSONObject req);
}
