package com.cigit.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 具体的聚合持有对象集合，管理元素（新增，删除），并返回一个迭代器
 * @Author:zhuzhou
 * @Date: 2019/11/6  10:53
 **/
public class ConcreteAggreate<T> implements  Aggreate<T> {
    private List<T> list = new ArrayList<>();
    @Override
    public void add(T t) {
        list.add(t);
    }

    @Override
    public void remove(T t) {
        list.remove(t);
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(list);
    }
}
