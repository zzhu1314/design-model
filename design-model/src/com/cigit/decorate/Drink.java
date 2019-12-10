package com.cigit.decorate;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/25  14:17
 **/
public  abstract class Drink {

    private String dec;
    private float price=0.0f;

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    protected abstract float cost();
}
