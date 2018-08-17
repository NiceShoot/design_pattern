package com.observe_pattern.service.serviceImpl;


import com.observe_pattern.service.Observer;

/**
 * @author jiabing
 * @Package com.observe_pattern.service.serviceImpl
 * @Description: 被观察者
 * @date 2018/6/12 14:21
 */
public class Display implements Observer {


    private String name;
    private String message;

    public Display(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        print();
    }

    public void print(){
        System.out.println(name+"--收到消息---"+message);
    }

}
