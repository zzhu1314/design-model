package com.cigit.strategy;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/12  9:56
 **/
public abstract class Duck {
    FlyBehavior flyBehavior;
    public void fly(FlyBehavior flyBehavior) {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
