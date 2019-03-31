package com.tqf.aop.aopdao;

/**
 * Created by Tang-QiFeng on 2019/3/31
 */
public class LogHandler {
    public void LogBefore()
    {
        System.out.println("Log before method");
    }

    public void LogAfter()
    {
        System.out.println("Log after method");
    }
}
