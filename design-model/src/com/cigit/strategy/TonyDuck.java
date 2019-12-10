package com.cigit.strategy;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/12  9:58
 **/
public class TonyDuck extends Duck {

    public TonyDuck() {
        flyBehavior = new NoFlyBehavior();
    }

}
