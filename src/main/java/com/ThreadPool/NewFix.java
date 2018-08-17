package com.ThreadPool;

import java.util.concurrent.*;

/**
 * @author jiabing
 * @Package com.ThreadPool
 * @Description: ${todo}
 * @date 2018/8/8 14:46
 */
public class NewFix {

    public static void main(String[] args){

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i=0;i<10;i++){
            final int a = i;
            try {
                Thread.sleep(100l);
            }catch (Exception e){
                e.printStackTrace();
            }
            executorService.execute(new Runnable() {
                public void run() {
                    System.out.println(a);
                }
            });
        }
        executorService.shutdown();
        return;
    }

}