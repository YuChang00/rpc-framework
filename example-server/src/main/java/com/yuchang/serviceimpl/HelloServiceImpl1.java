package com.yuchang.serviceimpl;

import com.yuchang.Hello;
import com.yuchang.HelloService;
import com.yuchang.annotation.RpcService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author yuchang
 */
@Slf4j
@RpcService(group = "test1", version = "version1")
public class HelloServiceImpl1 implements HelloService {

    static {
        System.out.println("HelloServiceImpl1被创建");
    }

    @Override
    public String hello(Hello hello) {
        log.info("HelloServiceImpl收到: {}.", hello.getMessage());
        String result = "Hello description is " + hello.getDescription();
        log.info("HelloServiceImpl返回: {}.", result);
        return result;
    }
}
