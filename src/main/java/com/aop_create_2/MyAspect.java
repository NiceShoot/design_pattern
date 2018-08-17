package com.aop_create_2;

/**
 * @author jiabing
 * @Package com.aop_create
 * @Description: 通知类
 * @date 2018/8/6 14:58
 */
public class MyAspect {


    void before(){
        System.out.println("---before---");
    }

    void after(){
        System.out.println("---after---");
    }

}