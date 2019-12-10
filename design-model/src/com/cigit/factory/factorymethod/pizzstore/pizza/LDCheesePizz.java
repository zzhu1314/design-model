package com.cigit.factory.factorymethod.pizzstore.pizza;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/11  16:41
 **/
public class LDCheesePizz extends Pizza {
    @Override
    public void prepare() {
        setName("LD的奶酪pizza");
        System.out.println(" LD的奶酪pizza 准备原材料");
    }
}
