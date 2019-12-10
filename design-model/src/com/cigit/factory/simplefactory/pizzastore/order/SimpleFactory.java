package com.cigit.factory.simplefactory.pizzastore.order;

import com.cigit.factory.simplefactory.pizzastore.pizza.ChessePizza;
import com.cigit.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.cigit.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/11  15:58
 * 定义一个简单工厂，将扩展方与使用放格力，SimpleFactory（提供方）orderPizza（使用方），遵循开闭原则，不方便扩展，会大量修改工厂类的代码
 * 简单工厂，就是在一个工厂中根据条件创建出所有需要的类
 * 改方法也可以为static方法，简单工厂也成静态工厂
 **/
public class SimpleFactory {
    public SimpleFactory() {

    }
    public Pizza createPizza(String type) {
        if ("greek".equals(type)) {
            return new GreekPizza();
        } else if ("chesse".equals(type)) {
            return new ChessePizza();
        }
        return null;
    }
}
