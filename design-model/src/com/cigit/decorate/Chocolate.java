package com.cigit.decorate;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/25  16:40
 **/
public class Chocolate extends Decorate {
    public Chocolate(Drink drink) {
        super(drink);
        setDec("chocolate");
        setPrice(12.8f);
    }

}
