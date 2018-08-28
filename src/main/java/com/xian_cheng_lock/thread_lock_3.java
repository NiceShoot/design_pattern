package com.xian_cheng_lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 多线程练习：
 * 1.开启一个线程打印1～52，开启另一个线程打印A～Z
 * 打印方式：12A34B46C依次打印
 * @author yw-tony
 *
 */
public class thread_lock_3 {

    public static void main(String[] args){
        final DataPrint data = new DataPrint();
        //打印字母的线程(大家也可以把这两个线程抽取出来作为两个单独的类，这里为了实现简单我就直接写在main方法中了)
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(data.letterFlag){
                    data.printLetter();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(data.numFlag){
                    data.printNun();
                }
            }
        }).start();
    }
    /**
     * 打印类
     * @author yw-tony
     *
     */
    static class DataPrint{

        //线程结束的标记
        Boolean letterFlag = true;
        Boolean numFlag = true;
        //初始化数字
        int num = 1;
        //初始化字母(字母最小 A 为 65) A-Z  Z为90
        int letter = 65;
        //线程等待标记,true 代表打印字母  false 代表打印数字
        Boolean flag = true;
        //创建锁
        final Object lock = new Object();

        /**
         * 打印字字母的方法
         *
         */
        public void printLetter(){
            //判断是否已经到达Z
            if(letter>90){
                letterFlag = false;
                return ;
            }
            synchronized (lock){
            try {
                if(flag){
                    //如果执行打印数字的线程正在执行，则该线程进入等待状态
                    lock.wait();
                }
                System.out.println(Thread.currentThread().getName()+":"+(char)letter);
                letter++;
                flag=true;
                lock.notify();
            }catch (Exception e){
                e.printStackTrace();
            }
            }
        }
        /**
         * 打印数字的方法
         */
        public void printNun(){
            //如果打印到52则结束线程并停止
            if(num>=52){
                numFlag = false;
                return;
            }
            synchronized (lock){
            try {
                if(!flag){
                    lock.wait();
                }
                System.out.println(Thread.currentThread().getName()+":"+num);
                num++;
                System.out.println(Thread.currentThread().getName()+":"+num);
                num++;
                Thread.sleep(100);
                flag = false;
                lock.notify();
            }catch (Exception e){
                e.printStackTrace();
            }
            }
        }
    }
}