package com.cigit.decorate.demo2;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/5  17:36
 **/
public class Jax extends Hero {

    public Jax(){
        setName("武器大师");
    }

    @Override
    void display() {
        System.out.println(super.getName());
    }
}
