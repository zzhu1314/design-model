package com.cigit.factory.simplefactory.pizzastore.pizza;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/11  15:28
 **/
public abstract class Pizza {
    private String name;

    //准备原材料, 不同的披萨不一样，因此，我们做成抽象方法
    public abstract void prepare();
    public void bake(){
        System.out.println(name+" is baking");
    }
    public void  cut(){
        System.out.println(name+" is cutting");
    }
    public void box(){
        System.out.println(name+" is boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
