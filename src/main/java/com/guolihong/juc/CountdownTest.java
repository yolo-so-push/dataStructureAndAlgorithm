package com.guolihong.juc;

import sun.misc.Unsafe;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class CountdownTest {
    private static int file=0;

    /**
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        int taskCount=5;
        CountDownLatch count=new CountDownLatch(taskCount);
        for (int i = 0; i <taskCount; i++) {
            executorService.submit(() -> {
                try {
                    //处理文件
                    file++;
                    Thread.sleep(1000);
                }catch (Exception ex){

                }finally {
                    count.countDown();
                }
            });
        }
        count.await();
        executorService.shutdown();
        System.out.println("file:"+file);
    }
}
