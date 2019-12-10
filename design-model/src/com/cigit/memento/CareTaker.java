package com.cigit.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/7  14:29
 * 备忘录管理类
 **/
public class CareTaker {

    private List<Memento> mementos = new ArrayList<>();//也可用HashMap來存储多种类型的备忘录

    public void addMemento(Memento memento){
        mementos.add(memento);
    }

    /**
     * 根据序号获取备忘录
     * @param index
     */
    public Memento getMemento(int index){
       return  mementos.get(index);
    }


}
