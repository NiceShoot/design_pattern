package com.xian_cheng_safe.execute;

import java.util.Vector;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author jiabing
 * @Package com.xian_cheng_safe
 * @Description: volatile
 * @date 2018/8/21 13:59
 */
public class xianCheng_volatile {


    static volatile int count = 0;
    //static int count = 0;
    //static AtomicInteger count = new AtomicInteger(0);
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        final CountDownLatch countDownLatch = new CountDownLatch(50);
        for(int i=0;i<50;i++){
            final int a = i;
            executorService.execute(new Runnable() {
                public void run() {
                    try {
                        //Thread.sleep(500l);
                        //count++;
                        //int get = count.incrementAndGet();
                        count = 100+a;
                        System.out.println(count);
                        countDownLatch.countDown();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            });
        }
        try {
            countDownLatch.await();
            System.out.println("最终：：：count======"+count);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            executorService.shutdown();
        }
    }

}