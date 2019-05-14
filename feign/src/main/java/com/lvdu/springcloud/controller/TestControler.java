package com.lvdu.springcloud.controller;

import com.lvdu.springcloud.rpc.TestRpc;
import com.lvdu.springcloud.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * TestControoler
 *
 * @author TONE
 * @date 2019/4/1
 */
@RestController
public class TestControler {

    @Resource
    private TestService testService;
    @Resource
    private TestRpc testRpc;


    @GetMapping(value = "/test")
    public String test(String name){
//        return name+"--"+testRpc.test(name);
        return name+"--"+testService.test(name);
    }
}
