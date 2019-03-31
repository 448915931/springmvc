package com.tqf.aop.controller;

import com.tqf.aop.service.HelloWorld;
import com.tqf.aop.service.impl.HelloWorldImpl1;
import com.tqf.aop.service.impl.HelloWorldImpl2;
import com.tqf.test.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tang-QiFeng on 2019/3/31
 */
@RestController
@RequestMapping("/testaop")
public class AopTest {

    @Autowired
    private HelloWorld helloWorldImpl1;
    @Autowired
    private HelloWorld helloWorldImpl2;


    /**
     *  http://localhost:8080/testaop/testaop
     *
     * @return
     */
    @RequestMapping(value = "/testaop",produces={"application/json;","text/html;charset=UTF-8;"})
    public String Testaop(){
        helloWorldImpl1.printHelloWorld();
        System.out.println();
        helloWorldImpl2.doPrint();
        return "成功";
    }


}
