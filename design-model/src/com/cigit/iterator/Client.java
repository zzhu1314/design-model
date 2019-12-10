package com.cigit.iterator;

import sun.misc.PostVMInitHook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/6  10:55
 **/
public class Client {
    public static void main(String[] args) {

        Aggreate<String> aggreate = new ConcreteAggreate<>();
        aggreate.add("1");
        aggreate.add("2");
        aggreate.add("3");
        Iterator<String> iterator = aggreate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
