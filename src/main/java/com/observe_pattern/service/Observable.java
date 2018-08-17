package com.observe_pattern.service;

/**
 * @author jiabing
 * @Package com.observe_pattern.service
 * @Description: 观察者
 * @date 2018/6/12 14:33
 */
public interface Observable {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObserver();

}
