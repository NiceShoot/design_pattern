package com.Singleton_pattern;

/**
 * @author jiabing
 * @Package com.Singleton_pattern
 * @Description: 饿汉式单例  静态常量
 * @date 2018/8/17 13:21
 */
public class SingletonClass_e_han_1 {


    private SingletonClass_e_han_1() {
    }
    //静态常量
    private final static SingletonClass_e_han_1 singletonClass_1 = new SingletonClass_e_han_1();

    public static SingletonClass_e_han_1 getSingletonClass_1(){

        return singletonClass_1;
    }

}