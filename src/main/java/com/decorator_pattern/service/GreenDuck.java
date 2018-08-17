package com.decorator_pattern.service;

/**
 * @author jiabing
 * @Package com.decorator_pattern.service
 * @Description: ${todo}
 * @date 2018/6/12 10:57
 */
public class GreenDuck extends Duck {


    public GreenDuck() {
        name();
        color();
        fly();
    }

    @Override
    public void color() {
        System.out.println("green duck");
    }

    @Override
    public void name() {
        System.out.println("小绿");
    }

    @Override
    public void fly() {
        System.out.println("can fly");
    }
}
