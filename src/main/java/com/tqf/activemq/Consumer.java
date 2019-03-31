package com.tqf.activemq;

import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Tang-QiFeng on 2019/3/30
 */
public class Consumer {
    private int querynum1;
    private int querynum2;
    private ExecutorService executorService;
    private ExecutorService executorService2;

    /**
     *  线程池处理消费方法(队列1)
     *
     * @param message
     */
    public void queryconsume1(MyMessage message) {
        System.out.println(querynum1+"号队列消费"+message);
        RunnableThread thread = new RunnableThread();
        executorService.execute(thread);
        System.out.println(querynum1+"号消费完了"+message);
        //关闭线程池
//        executorServic.shutdown();
    }
    /**
     *  线程池处理消费方法(队列2)
     *
     * @param message
     */
    public void queryconsume2(MyMessage message) {
        System.out.println(querynum2+"号消费"+message);
        RunnableThread2 thread = new RunnableThread2();
        executorService2.execute(thread);
        System.out.println(querynum2+"号消费完了"+message);

    }


    public int getQuerynum1() {
        return querynum1;
    }

    public void setQuerynum1(int querynum1) {
        this.querynum1 = querynum1;
    }

    public int getQuerynum2() {
        return querynum2;
    }

    public void setQuerynum2(int querynum2) {
        this.querynum2 = querynum2;
    }

    public ExecutorService getExecutorService() {
        return executorService;
    }

    public void setExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
    }

    public ExecutorService getExecutorService2() {
        return executorService2;
    }

    public void setExecutorService2(ExecutorService executorService2) {
        this.executorService2 = executorService2;
    }
}

class RunnableThread implements Runnable
{
    @Override
    public void run()
    {
        try {
            Thread.sleep(5000);
            System.out.println("通过线程池方式创建的线程：" + Thread.currentThread().getName() + " ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
class RunnableThread2 implements Runnable
{
    @Override
    public void run()
    {
        try {
            Thread.sleep(10000);
            System.out.println("通过线程池方式创建的线程：" + Thread.currentThread().getName() + " ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}