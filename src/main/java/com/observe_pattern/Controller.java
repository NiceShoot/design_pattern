package com.observe_pattern;

import com.observe_pattern.service.serviceImpl.Display;
import com.observe_pattern.service.serviceImpl.MyObservable;

/**
 * @author jiabing
 * @Package com.observe_pattern
 * @Description: 观察者模式
 * @date 2018/6/12 10:12
 */
public class Controller {


    public static void main(String[] args) {

        MyObservable myObservable = new MyObservable();
        Display d1 = new Display("用户 1");
        Display d2 = new Display("用户 2");
        Display d3 = new Display("用户 3");
        myObservable.registerObserver(d1);
        myObservable.registerObserver(d2);
        myObservable.registerObserver(d3);

        myObservable.setInformation("消息----11111");

        myObservable.removeObserver(d2);
        myObservable.setInformation("java是世界上最叼的语言");

    }

}
