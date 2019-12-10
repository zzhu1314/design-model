package com.cigit.memento;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/7  14:24
 * 原始类
 **/
public class Originator {
    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 保存状态到备忘录并返回备忘录
     * @return
     */
    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    /**
     * 从备忘录中获取状态
     * @param memento
     */
    public void getStateFromMemento(Memento memento){
          state = memento.getState();
    }
}
