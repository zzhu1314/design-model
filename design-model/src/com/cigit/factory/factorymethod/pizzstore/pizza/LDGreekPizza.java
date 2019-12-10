package com.cigit.factory.factorymethod.pizzstore.pizza;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/11  16:40
 **/
public class LDGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("LD的Greekpizza");
        System.out.println(" LD的Greekpizza 准备原材料");
    }
}
