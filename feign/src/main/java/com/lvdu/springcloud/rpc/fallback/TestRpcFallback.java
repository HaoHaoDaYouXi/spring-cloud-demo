package com.lvdu.springcloud.rpc.fallback;

import com.lvdu.springcloud.rpc.TestRpc;
import org.springframework.stereotype.Service;

/**
 * TestRpcFallback
 *
 * @author TONE
 * @date 2019/5/14
 */
@Service
public class TestRpcFallback implements TestRpc {
    @Override
    public String test(String name) {
        return null;
    }
}
