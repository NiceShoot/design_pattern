package com.xian_cheng_safe.execute;

import com.xian_cheng_safe.task.task_runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author jiabing
 * @Package com.xian_cheng_safe
 * @date 2018/8/21 13:59
 */
public class xianCheng_runnable {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i=0;i<10;i++){
            final int a = i;
            executorService.execute(new task_runnable(a));
        }
        executorService.shutdown();
    }

}