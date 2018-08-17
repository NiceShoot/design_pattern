package com.ThreadCyclicBarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * @author jiabing
 * @Package com.ThreadPool
 * @Description: ${todo}
 * @date 2018/8/16 17:08
 */
public class Task implements Runnable {

    private int count;
    private CyclicBarrier cyclicBarrier;
    public Task(int count,CyclicBarrier cyclicBarrier) {
        this.count = count;
        this.cyclicBarrier = cyclicBarrier;
    }

    public void run() {
        System.out.println("进门了-----------");
        try {
            cyclicBarrier.await();
            System.out.println("-----------子线程 --task_"+count+":::"+cyclicBarrier.getParties()+"----------------");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}