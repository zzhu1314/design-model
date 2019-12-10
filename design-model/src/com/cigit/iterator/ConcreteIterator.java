package com.cigit.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代器，只处理遍历元素
 * @Author:zhuzhou
 * @Date: 2019/11/6  10:48
 **/
public class ConcreteIterator<T> implements Iterator<T> {
    int cursor;
    private List<T> list ;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor!=list.size();
    }

    @Override
    public T next() {
        T obj = null;
        if(this.hasNext()){
            obj = this.list.get(cursor);
            ++cursor;
        }
        return obj;
    }
}
