package com.cigit.bridge;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/22  14:21
 * 起使方，接口的调用从这里开始的
 **/
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("小米开机");
    }

    @Override
    public void close() {
        System.out.println("小米关机");

    }

    @Override
    public void call() {
        System.out.println("小米打电话");

    }
}
