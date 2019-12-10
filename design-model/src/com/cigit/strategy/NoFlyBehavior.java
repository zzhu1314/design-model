package com.cigit.strategy;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/12  9:55
 **/
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞。。。。");
    }
}
