package com.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author jiabing
 * @Package com.ThreadPool
 * @Description: ${todo}
 * @date 2018/8/16 15:22
 */
public class newCache {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i=0;i<10;i++){
            final int a = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {

                    try {
                        Thread.sleep(100l);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    String name = Thread.currentThread().getName();
                    System.out.println(name+"::::"+a);
                    return;
                }
            });

        }
        executorService.shutdown();
        return;
    }

}