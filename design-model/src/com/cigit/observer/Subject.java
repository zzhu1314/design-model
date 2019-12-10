package com.cigit.observer;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/6  14:15
 * 抽象的被观察者
 **/
public interface Subject {
    void registObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
