package com.cigit.bridge;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/22  14:21
 **/
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("Vivo开机");
    }

    @Override
    public void close() {
        System.out.println("Vivo关机");

    }

    @Override
    public void call() {
        System.out.println("Vivo打电话");

    }
}
