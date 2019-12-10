package com.cigit.factory.simplefactory.pizzastore.pizza;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/11  15:32
 **/
public class ChessePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 给制作奶酪披萨 准备原材料 ");
    }
}
