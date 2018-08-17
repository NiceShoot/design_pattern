package com.ThreadCyclicBarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author jiabing
 * @Package com.ThreadPool
 * @Description: ${todo}
 * @date 2018/8/8 14:46
 */
public class CyclicBarrierClass {

    public static void main(String[] args){

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        CyclicBarrierTest(executorService);

        executorService.shutdown();
        return;
    }

    /**
     * CyclicBarrierTest
     * @param executorService
     */
    private static void CyclicBarrierTest(ExecutorService executorService) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2,new Task_2());
        for(int i=0;i<10;i++){
            final int a = i;
            try {
                Thread.sleep(10l);
            }catch (Exception e){
                e.printStackTrace();
            }
            executorService.execute(new Task(1,cyclicBarrier));
        }
    }

}