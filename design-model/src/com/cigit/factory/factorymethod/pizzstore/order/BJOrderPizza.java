package com.cigit.factory.factorymethod.pizzstore.order;

import com.cigit.factory.factorymethod.pizzstore.pizza.BJCheesePizza;
import com.cigit.factory.factorymethod.pizzstore.pizza.BJGreekPizza;
import com.cigit.factory.factorymethod.pizzstore.pizza.Pizza;


/**
 * @Author:zhuzhou
 * @Date: 2019/10/11  16:42
 **/
public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new BJCheesePizza();
        }else if("greek".equals(orderType)){
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
