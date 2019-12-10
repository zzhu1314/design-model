package com.cigit.adapter.objectadapter;


/**
 * @Author:zhuzhou
 * @Date: 2019/10/18  10:16
 * 对象适配器,将被适配的类聚合到适配器中，而不是继承，降低耦合性
 **/
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charge(new VolatageAdapter(new Voltage220V()));
    }
}
