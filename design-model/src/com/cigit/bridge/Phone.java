package com.cigit.bridge;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/22  14:23
 * 抽象类充当桥梁
 **/
public abstract class Phone {
    private Brand brand;
    public Phone(Brand brand){
        this.brand = brand;//聚合关系
    }

    public void  open(){
        brand.open();
    }
    public void  close(){
        brand.close();
    }
    public void  call(){
        brand.call();
    }
}
