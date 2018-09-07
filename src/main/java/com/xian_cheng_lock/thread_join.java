package com.xian_cheng_lock;

/**
 * @author jiabing
 * @Package com.xian_cheng_lock
 * @Description: ${todo}
 * @date 2018/8/28 11:01
 */
public class thread_join {

    public static void main(String[] args) throws InterruptedException {
//        ThreadJoinTest thread_1 = new ThreadJoinTest("小明");
//        ThreadJoinTest thread_2 = new ThreadJoinTest("小红");
//        thread_1.start();
//        thread_1.join();
//        thread_2.start();



        Thread t_1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("A");
            }
        });
        Thread t_2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("B");
            }
        });
        Thread t_3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("C");
            }
        });

        t_1.start();t_1.join();
        t_2.start();t_2.join();
        t_3.start();
    }

}

class ThreadJoinTest extends Thread{
    public ThreadJoinTest(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println(this.getName() + ":" + i);
        }
    }
}