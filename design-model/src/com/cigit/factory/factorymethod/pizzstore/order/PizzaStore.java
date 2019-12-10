package com.cigit.factory.factorymethod.pizzstore.order;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/11  16:50
 **/
public class PizzaStore {
    public static void main(String[] args) {
        String loc = "bj";
        if("bj".equals(loc)){
            new BJOrderPizza();
        }else {
            new LDOrderPizza();
        }
    }
}
