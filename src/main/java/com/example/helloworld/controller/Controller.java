package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Map<String, String> hello(){

        Map value = new HashMap();
        value.put("response_type", "hello world!");
        value.put("text", "hello world!");
        
        return value;
    }
}
