package com.cigit.iterator;


import java.util.Iterator;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/6  10:52
 **/
public interface Aggreate<T> {

    void add(T t);
    void remove(T t);
    Iterator<T> createIterator();
}
