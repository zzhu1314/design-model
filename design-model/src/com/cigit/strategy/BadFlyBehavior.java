package com.cigit.strategy;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/12  9:55
 **/
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞的很糟糕。。。");
    }
}
