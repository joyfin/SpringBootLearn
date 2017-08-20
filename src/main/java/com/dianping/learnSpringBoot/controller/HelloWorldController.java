package com.dianping.learnSpringBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//RestController ：HelloWorldController的输出都是json格式
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @RequestMapping("/hello/params")
    public Map<String, String> helloParams(@RequestParam String aa) {
        Map<String, String> result = new HashMap<>();
        result.put("name", aa);
        return result;
    }

    @RequestMapping("*.json")
    public String parseJson(@RequestParam(name = "title") String title){
        return "json title:" + title;
    }

}
