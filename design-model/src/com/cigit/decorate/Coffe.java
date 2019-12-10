package com.cigit.decorate;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/25  15:42
 **/
public class Coffe extends Drink {
    @Override
    protected float cost() {
        return super.getPrice();
    }
}
