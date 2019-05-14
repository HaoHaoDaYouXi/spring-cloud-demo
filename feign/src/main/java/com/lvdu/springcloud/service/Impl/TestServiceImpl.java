package com.lvdu.springcloud.service.Impl;

import com.lvdu.springcloud.rpc.TestRpc;
import com.lvdu.springcloud.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * testServiceImpl
 *
 * @author TONE
 * @date 2019/4/1
 */
@Service("TestService")
public class TestServiceImpl implements TestService {

    @Resource
    private TestRpc testRpc;

    @Override
    public String test(String name) {
        return testRpc.test(name);
    }
}
