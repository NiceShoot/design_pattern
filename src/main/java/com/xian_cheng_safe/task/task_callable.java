package com.xian_cheng_safe.task;

import java.util.concurrent.Callable;

/**
 * @author jiabing
 * @Package com.xian_cheng_safe.task
 * @Description: ${todo}
 * @date 2018/8/22 11:04
 */
public class task_callable implements Callable<Integer>{

    private int count;

    public task_callable(int count) {
        this.count = count;
    }

    public Integer call() throws Exception {
        //System.out.println(count);
        return count;
    }
}