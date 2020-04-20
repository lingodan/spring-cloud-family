package com.lingodan.school.consumer.remote;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class SimpleFacadeFallback implements SimpleFacade {
    @Override
    public String returnHello(String id) {
        System.out.println("Fallback:" + id);
        return "老弟你来啦";
    }

    @Override
    public String returnPost(JSONObject req) {
        return "失败调用";
    }
}
