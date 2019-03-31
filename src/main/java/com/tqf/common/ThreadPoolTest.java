package com.tqf.common;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Tang-QiFeng on 2019/3/30
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService executorService=Executors.newFixedThreadPool(3);
        for (int i=0;i<15;i++){
            executorService.execute(new TestRunnable(i));
        }
        executorService.shutdown();

    }
}

class TestRunnable implements Runnable {

    private int i;

    TestRunnable(int i){
        this.i=i;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("我是线程:"+Thread.currentThread().getName()+"  我得到了值："+i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
