package com.lvdu.springcloud.controller;

import com.lvdu.springcloud.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * TestController
 *
 * @author TONE
 * @date 2019/3/29
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;


    @GetMapping(value = "/test")
    public String test(String name){
        return name+"--先来Consumer,再去Provider--"+testService.test(name);
    }


}
