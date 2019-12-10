package com.cigit.factory.simplefactory.pizzastore.pizza;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/11  15:33
 **/
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 给制作Greek披萨 准备原材料 ");
    }
}
