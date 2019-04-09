package com.lvdu.springcloud.service.Impl;

import com.lvdu.springcloud.service.TestService;
import org.springframework.stereotype.Service;

/**
 * TestServiceImpl
 *
 * @author TONE
 * @date 2019/3/29
 */
@Service("TestService")
public class TestServiceImpl implements TestService {

    @Override
    public String test() {
        return "TestService";
    }
}
