package com.tqf.aop.service.impl;

import com.tqf.aop.service.HelloWorld;

/**
 * Created by Tang-QiFeng on 2019/3/31
 */
public class HelloWorldImpl1 implements HelloWorld {

    @Override
    public void printHelloWorld() {
        System.out.println("Enter HelloWorldImpl1.printHelloWorld()");
    }

    @Override
    public void doPrint() {
        System.out.println("Enter HelloWorldImpl1.doPrint()");
    }
}
