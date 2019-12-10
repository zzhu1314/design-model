package com.cigit.factory.simplefactory.pizzastore.order;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/11  15:39
 **/
public class PizzaStore {
    public static void main(String[] args) {
        //new OrderPizza();
        new OrderPizza(new SimpleFactory());
    }
}
