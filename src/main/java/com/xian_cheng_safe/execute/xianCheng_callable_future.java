package com.xian_cheng_safe.execute;

import com.xian_cheng_safe.task.task_callable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @author jiabing
 * @Package com.xian_cheng_safe
 * @date 2018/8/21 13:59
 */
public class xianCheng_callable_future {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            Future<Integer> future = executorService.submit(new task_callable(i));
            try {
                boolean cancelled = future.isCancelled();
                boolean done = future.isDone();
                list.add(future.get());
                System.out.println("cancelled=="+cancelled+",done=="+done+","+future.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(list);
        executorService.shutdown();
    }
}