package com.cigit.memento;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/7  14:32
 **/
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator("state1#");
        CareTaker careTaker = new CareTaker();
        Memento memento1 = originator.saveStateToMemento();
        careTaker.addMemento(memento1);
        originator.setState("state2#");
        Memento memento2 = originator.saveStateToMemento();
        careTaker.addMemento(memento2);
        System.out.println("=====当前状态"+originator.getState());
        System.out.println("========回退到第一步");
        Memento memento = careTaker.getMemento(0);
        originator.getStateFromMemento(memento);
        System.out.println("=====当前状态"+originator.getState());

    }
}
