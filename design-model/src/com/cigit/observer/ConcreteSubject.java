package com.cigit.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/6  14:17
 **/
public class ConcreteSubject implements Subject {
    String message;
    private List<Observer> observers;
    public ConcreteSubject(){
        observers = new ArrayList<>();
    }
    public void setMessage(String message){
        this.message = message;
        notifyObservers();
    }
    @Override
    public void registObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observers.contains(observers)){
            observers.remove(observer);
        }

    }

    @Override
    public void notifyObservers() {
        for (Observer observer:observers){
            observer.update(message);
        }
    }
}
