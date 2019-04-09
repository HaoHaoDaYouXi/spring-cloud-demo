package com.lvdu.springcloud.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * testRpc
 *
 * @author TONE
 * @date 2019/4/1
 */
@FeignClient(value = "ribbon-consumer")
public interface TestRpc {
    /**
     * test
     * @param name
     * @return
     */
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String test(@RequestParam("name") String name);


}
