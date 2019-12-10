package com.cigit.observer;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/6  14:28
 **/
public class ConcreteObserve01 implements Observer {
    @Override
    public void update(String message) {
        show(message);
    }
    public void show(String message){
        System.out.println("====我是观察者01=======");
        System.out.println("接收到消息:"+message);
    }
}
