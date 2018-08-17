package com.decorator_pattern.service;

/**
 * @author jiabing
 * @Package com.decorator_pattern.service
 * @Description: ${todo}
 * @date 2018/6/12 10:53
 */
public abstract class Duck {


    public void color(){}

    public void name(){}

    public void fly(){}

    public void type(){
        System.out.println("都是鸭子");
    }

}
