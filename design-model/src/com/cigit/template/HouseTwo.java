package com.cigit.template;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/31  16:20
 **/
public class HouseTwo extends HouseTemplate {
    protected HouseTwo(String name,boolean isBuildToilet) {
        super(name,isBuildToilet);
    }

    @Override
    protected void buildDoor() {
        System.out.println(name+"做成卷帘门");

    }

    @Override
    protected void buildWindow() {
        System.out.println(name+"做成卷帘窗");

    }

    @Override
    protected void buildRoom() {
        System.out.println(name+"做成2室");

    }

    @Override
    protected void buidToilet() {

    }

    @Override
    public boolean isBuildToilet() {
        return isBuildToilet;
    }
}
