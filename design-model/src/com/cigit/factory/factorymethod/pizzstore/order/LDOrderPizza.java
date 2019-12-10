package com.cigit.factory.factorymethod.pizzstore.order;

import com.cigit.factory.factorymethod.pizzstore.pizza.LDCheesePizz;
import com.cigit.factory.factorymethod.pizzstore.pizza.LDGreekPizza;
import com.cigit.factory.factorymethod.pizzstore.pizza.Pizza;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/11  16:43
 **/
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new LDCheesePizz();
        }else if("greek".equals(orderType)){
            pizza = new LDGreekPizza();
        }
        return pizza;
    }
}
