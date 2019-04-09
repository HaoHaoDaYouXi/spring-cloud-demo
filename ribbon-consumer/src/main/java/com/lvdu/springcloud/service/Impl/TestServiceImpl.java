package com.lvdu.springcloud.service.Impl;

import com.lvdu.springcloud.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * TestServiceImpl
 *
 * @author TONE
 * @date 2019/3/29
 */
@Service("TestService")
public class TestServiceImpl implements TestService {

    @Autowired
    private RestTemplate restTemplate;


    @Override
    public String test(String name) {
        return restTemplate.getForObject("http://ribbon-provider/test?name="+name,String.class);
    }
}
