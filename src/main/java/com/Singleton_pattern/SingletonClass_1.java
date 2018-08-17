package com.Singleton_pattern;

/**
 * @author jiabing
 * @Package com.Singleton_pattern
 * @Description: 饿汉式单例
 * @date 2018/8/17 13:21
 */
public class SingletonClass_1 {


    private SingletonClass_1() {
    }

    private SingletonClass_1 singletonClass_1 = new SingletonClass_1();

    public SingletonClass_1 getSingletonClass_1(){

        return singletonClass_1;
    }

}