package com.cigit.strategy;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/12  10:01
 **/
public class ClientTest {
    public static void main(String[] args) {
        TonyDuck tonyDuck = new TonyDuck();
        tonyDuck.fly(new GoodFlyBehavior());
        tonyDuck.setFlyBehavior(new GoodFlyBehavior());
        tonyDuck.fly(new BadFlyBehavior());//策略模式，行为参数化
    }
}
