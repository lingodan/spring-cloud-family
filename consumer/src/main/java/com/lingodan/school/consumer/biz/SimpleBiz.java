package com.lingodan.school.consumer.biz;

import com.alibaba.fastjson.JSONObject;
import com.lingodan.school.consumer.remote.AnotherSimpleFacade;
import com.lingodan.school.consumer.remote.SimpleFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class SimpleBiz {

    @Autowired
    private SimpleFacade simpleFacade;
    @Autowired
    private AnotherSimpleFacade anotherSimpleFacade;

    public String returnSimple(String id) {
        return simpleFacade.returnHello(id);
    }

    public String returnPost() {
        JSONObject req = new JSONObject().fluentPut("hello","world");
        return simpleFacade.returnPost(req);
    }
    public String returnSimple1(String id) {
        return anotherSimpleFacade.returnHello(id);
    }

    public String returnPost1() {
        JSONObject req = new JSONObject().fluentPut("hello","world");
        return anotherSimpleFacade.returnPost(req);
    }
}
