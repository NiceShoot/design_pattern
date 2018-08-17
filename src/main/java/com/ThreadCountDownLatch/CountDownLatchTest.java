package com.ThreadCountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author jiabing
 * @Package com.ThreadPool
 * @Description: ${todo}
 * @date 2018/8/8 14:46
 */
public class CountDownLatchTest {

    public static void main(String[] args){

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        countDownLatch(executorService);
        executorService.shutdown();
        return;
    }

    /**
     * countDownLatch
     * @param executorService
     */
    private static void countDownLatch(ExecutorService executorService) {
        final CountDownLatch countDownLatch = new CountDownLatch(10);
        for(int i=0;i<10;i++){
            final int a = i;
            try {
                Thread.sleep(10l);
            }catch (Exception e){
                e.printStackTrace();
            }
            executorService.execute(new Runnable() {
                public void run() {
                    countDownLatch.countDown();
                    System.out.println(a);
                }
            });
        }
        try {
            countDownLatch.await();
            System.out.println("10个子线程已经执行完毕");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}