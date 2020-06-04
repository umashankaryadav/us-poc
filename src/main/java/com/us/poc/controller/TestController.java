package com.us.poc.controller;

import com.us.poc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/api")
public class TestController {


    private TestService testService;

    @Autowired
    public void setTestService(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping(value = "/get/{id}", method= RequestMethod.GET)
    public String getId(@PathVariable String id){
        return id;
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public void updateId(@PathVariable Integer id){

    }
    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE)
    public void deleteId(@PathVariable Integer id){

    }
}
