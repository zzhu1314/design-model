package com.cigit.observer;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/6  14:29
 **/
public class Client {
    public static void main(String[] args) {
        //被观察者
        ConcreteSubject concreteSubject = new ConcreteSubject();
        //观察者1
        ConcreteObserve01 concreteObserve01 = new ConcreteObserve01();
        ConcreteObserver02 concreteObserve02 = new ConcreteObserver02();
        //新增观察者
        concreteSubject.registObserver(concreteObserve01);
        concreteSubject.registObserver(concreteObserve02);
        concreteSubject.setMessage("java开发");
    }
}
