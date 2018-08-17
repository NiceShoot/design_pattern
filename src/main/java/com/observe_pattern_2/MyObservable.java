package com.observe_pattern_2;


import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * @author jiabing
 * @Package com.observe_pattern_2
 * @Description: ${todo}
 * @date 2018/6/12 15:11
 */
public class MyObservable extends Observable {

    private List<Observer> list;

    private String message;

    public MyObservable() {
        this.list = new ArrayList<Observer>();
    }

    @Override
    public synchronized void addObserver(Observer o) {
        list.add(o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        if(!list.isEmpty())
            list.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(int i=0;i<list.size();i++){
            Observer o = list.get(i);
            o.update(null,message);
        }
    }

    protected void setChanged(String message) {
        this.message = message;
        System.out.println("发布消息：====="+message);
        notifyObservers();
    }
}
