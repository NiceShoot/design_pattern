package com.ThreadCyclicBarrier;

/**
 * @author jiabing
 * @Package com.ThreadPool
 * @Description: ${todo}
 * @date 2018/8/16 17:08
 */
public class Task_2 implements Runnable {

    public void run() {

        try {
            Thread.sleep(0);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("------cyclicBarrier-----task_2--"+Thread.currentThread().toString()+"--------------");
    }
}