package com.cigit.decorate;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/25  15:45
 **/
public class Decorate extends Drink {
    private Drink drink;
    public Decorate(Drink drink){//组合(装饰者要包含被装设者)
        this.drink = drink;
    }
    @Override
    protected float cost() {
        return super.getPrice()+drink.getPrice();
    }

    @Override
    public String getDec() {
        // TODO Auto-generated method stub
        // obj.getDes() 输出被装饰者的信息
        return  super.getDec()+ " " + getPrice() + " && " + drink.getDec()+" "+drink.getPrice();
    }
}
