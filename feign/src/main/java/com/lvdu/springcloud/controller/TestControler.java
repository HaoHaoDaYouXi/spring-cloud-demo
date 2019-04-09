package com.lvdu.springcloud.controller;

import com.lvdu.springcloud.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestControoler
 *
 * @author TONE
 * @date 2019/4/1
 */
@RestController
public class TestControler {

    @Autowired
    private TestService testService;


    @GetMapping(value = "/test")
    public String test(String name){
        return name+"--"+testService.test(name);
    }
}
