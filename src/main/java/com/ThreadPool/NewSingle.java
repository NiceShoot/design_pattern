package com.ThreadPool;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author jiabing
 * @Package com.xian_cheng_chi.first
 * @Description: ${todo}
 * @date 2018/8/8 13:47
 */
public class NewSingle{


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0;i<10;i++){
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
        return;
    }






}