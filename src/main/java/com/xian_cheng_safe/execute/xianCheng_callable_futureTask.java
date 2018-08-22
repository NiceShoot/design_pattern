package com.xian_cheng_safe.execute;

import com.xian_cheng_safe.task.task_callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author jiabing
 * @Package com.xian_cheng_safe
 * @date 2018/8/21 13:59
 */
public class xianCheng_callable_futureTask {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i=0;i<20;i++){
            FutureTask<Integer> futureTask = new FutureTask<Integer>(new task_callable(i));
            executorService.execute(futureTask);
            //executorService.submit(futureTask);
            try {
                boolean cancelled = futureTask.isCancelled();
                boolean done = futureTask.isDone();
                System.out.println(futureTask.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
    }

}