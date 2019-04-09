package com.lvdu.springcloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

/**
 * RoutingFitler
 *
 * @author TONE
 * @date 2019/4/9
 */
public class RoutingFitler extends ZuulFilter {
    @Override
    public String filterType() {
        return "routing";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        return null;
    }
}
