package com.cigit.adapter.interfaceadapter;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/18  10:36
 **/
public class Client {
    public static void main(String[] args) {
        AbstractAdapter abstractAdapter = new AbstractAdapter() {
            @Override
            public void m1() {
                System.out.println("我只使用m1的方法");
            }
        };
    }
}
