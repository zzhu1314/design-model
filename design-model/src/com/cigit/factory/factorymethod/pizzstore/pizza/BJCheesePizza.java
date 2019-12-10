package com.cigit.factory.factorymethod.pizzstore.pizza;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/11  16:39
 **/
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京的奶酪pizza");
        System.out.println(" 北京的奶酪pizza 准备原材料");
    }
}
