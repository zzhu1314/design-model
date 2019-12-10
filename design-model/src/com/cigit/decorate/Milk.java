package com.cigit.decorate;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/25  16:39
 **/
public class Milk extends Decorate {

    public Milk(Drink drink) {
        super(drink);
        setDec("milk");
        setPrice(6.2f);
    }

}
