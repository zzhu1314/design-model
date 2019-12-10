package com.cigit.decorate.demo2;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/5  17:39
 **/
public class DragonKing extends Hero {
    public DragonKing() {
        setName("铸星龙王");
    }

    @Override
    void display() {
        System.out.println(super.getName());
    }
}
