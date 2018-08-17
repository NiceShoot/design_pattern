package com.decorator_pattern.service;

/**
 * @author jiabing
 * @Package com.decorator_pattern.service
 * @Description: ${todo}
 * @date 2018/6/12 10:56
 */
public class RedDuck extends Duck {

    public RedDuck() {
        name();
        color();
        fly();
        action();
    }

    @Override
    public void name() {
        System.out.println("小红");
    }

    @Override
    public void color() {
        System.out.println("红色的鸭子");
    }

    @Override
    public void fly() {
        System.out.println("no fly");
    }

    public void action(){
        System.out.println("附加行为");
    }
}
