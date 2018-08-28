package com.xian_cheng_lock;

/**
 * @author jiabing
 * @Package com.xian_cheng_lock
 * @Description: ${todo}
 * @date 2018/8/28 11:01
 */
public class thread_join {

    public static void main(String[] args) throws InterruptedException {
        ThreadJoinTest thread_1 = new ThreadJoinTest("小明");
        ThreadJoinTest thread_2 = new ThreadJoinTest("小红");
        thread_1.start();
        thread_1.join();
        thread_2.start();
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