package com.cigit.factory.factorymethod.pizzstore.order;


import com.cigit.factory.factorymethod.pizzstore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 工厂方法有多个工厂，让一个工厂去生产一类的对象，并让该工厂实现一个抽象工厂
 * 定义一个创建对象的抽象方法，由子类决定要实例化的类，工厂方法模式：将对象的实例化推给了子类去实现
 * 工厂方法在代码的结构上比简单工厂复杂，但类的简洁度上更清晰，完全符合ocp原则
 * @Author:zhuzhou
 * @Date: 2019/10/11  15:35
 **/
public abstract class OrderPizza {
    //定义一个抽象方法，createPizza , 让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);
    public OrderPizza() {
        Pizza pizza = null;
        String orderType; // 订购披萨的类型
        do {
            orderType = getType();
            pizza = createPizza(orderType); //抽象方法，由工厂子类完成
            //输出pizza 制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        } while (true);
    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
