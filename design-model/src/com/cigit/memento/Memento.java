package com.cigit.memento;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/7  14:24
 * 备忘录类
 **/
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
