package com.cigit.strategy;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/12  9:54
 **/
public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞的超级棒。。。。");
    }
}
