package com.cigit.template;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/31  16:06
 * 模板方法类一般是一个抽象类，具体方法是final型，模板方法是abstract
 **/
public abstract  class HouseTemplate {
    protected String name;
    protected  boolean isBuildToilet;

    protected HouseTemplate(String name,boolean isBuildToilet){
        this.name = name;
        this.isBuildToilet = isBuildToilet;
    }
    protected abstract void buildDoor();

    protected abstract void buildWindow();

    protected abstract void buildRoom();

    protected abstract void buidToilet();

    /**
     * 具体方法(公共逻辑)
     */
    protected final void build(){
        buildDoor();
        buildWindow();
        buildRoom();
        if(isBuildToilet()){
            buidToilet();
        }
        System.out.println("======================");
    }

    /**钩子方法,用于判断该模板方法是否执行
     *
     * @return
     */
    public boolean isBuildToilet(){
        return true;
    }

}
