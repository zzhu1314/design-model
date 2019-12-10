package com.cigit.adapter.classadapter;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/18  10:16
 * 类适配器,需要继承源，增加了耦合性
 **/
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charge(new VolatageAdapter());
    }
}
