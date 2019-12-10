package com.cigit.factory.factorymethod.pizzstore.pizza;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/11  16:40
 **/
public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的Greekpizza");
        System.out.println(" 北京的Greekpizza 准备原材料");
    }
}
