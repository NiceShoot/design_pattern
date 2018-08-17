package com.observe_pattern.service.serviceImpl;

import com.observe_pattern.service.Observable;
import com.observe_pattern.service.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiabing
 * @Package com.observe_pattern.service
 * @Description: ${todo}
 * @date 2018/6/12 14:17
 */
public class MyObservable implements Observable {

    private List<Observer> list ;
    private String message;

    public MyObservable(){
        this.list = new ArrayList<Observer>();
    }

    @Override
    public  void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public  void removeObserver(Observer o) {
        if(!list.isEmpty())
        list.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(int i=0;i<list.size();i++){
            Observer observer = list.get(i);
            observer.update(message);
        }
    }


    public void  setInformation(String str){
        this.message = str;
        System.out.println("服务更新消息： " + str);
        //通知所有被观察者
        notifyObserver();
    }
}
