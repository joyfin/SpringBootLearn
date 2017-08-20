package com.dianping.learnSpringBoot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class HelloWorldPageController {

    @Value("${application.hello:jenny}")
    private String name = null;

    @RequestMapping("/index1")
    public String index(Map<String, Object> model) {
        model.put("name", name);
        return "index";
    }

    @RequestMapping("/index2")
    public ModelAndView index2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", name);

        return modelAndView;
    }
}
