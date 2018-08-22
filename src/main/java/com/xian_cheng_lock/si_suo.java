package com.xian_cheng_lock;

/**
 * @author jiabing
 * @Package com.lock
 * @Description: 死锁
 * @date 2018/8/22 11:40
 */
public class si_suo {

    private final static Object lock_1 = new Object();
    private final static Object lock_2 = new Object();

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (lock_1){
                    System.out.println(Thread.currentThread().getName()+"===lock_1");

                    try {
                        Thread.sleep(100);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    synchronized (lock_2){
                        System.out.println(Thread.currentThread().getName()+"===lock_2");
                    }

                }


            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (lock_2){
                    System.out.println(Thread.currentThread().getName()+"===lock_2");

                    try {
                        Thread.sleep(100);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    synchronized (lock_1){
                        System.out.println(Thread.currentThread().getName()+"===lock_1");
                    }

                }


            }
        }).start();
    }

}