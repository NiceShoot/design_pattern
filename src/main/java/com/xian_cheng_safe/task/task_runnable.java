package com.xian_cheng_safe.task;

/**
 * @author jiabing
 * @Package com.xian_cheng_safe.task
 * @Description: ${todo}
 * @date 2018/8/22 11:04
 */
public class task_runnable implements Runnable {

    private int count;

    public task_runnable(int count) {
        this.count = count;
    }

    public void run() {
        try {
            Thread.sleep(200);
            String name = Thread.currentThread().getName();
            System.out.println(name+"====="+count);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}