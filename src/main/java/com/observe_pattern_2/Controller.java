package com.observe_pattern_2;


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
        myObservable.addObserver(d1);
        myObservable.addObserver(d2);
        myObservable.addObserver(d3);

        myObservable.setChanged("消息----11111");

        myObservable.deleteObserver(d2);
        myObservable.setChanged("java是世界上最叼的语言");

    }

}
