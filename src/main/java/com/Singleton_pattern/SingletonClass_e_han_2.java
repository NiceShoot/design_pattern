package com.Singleton_pattern;

/**
 * @author jiabing
 * @Package com.Singleton_pattern
 * @Description: 饿汉式单例  静态代码块
 * @date 2018/8/17 13:21
 */
public class SingletonClass_e_han_2 {


    private SingletonClass_e_han_2() {
    }

    //静态代码块
    private static  SingletonClass_e_han_2 singletonClass_1 = null;

    static {
        singletonClass_1 = new SingletonClass_e_han_2();
    }

    public static SingletonClass_e_han_2 getSingletonClass_1(){

        return singletonClass_1;
    }

}