package com.cigit.template;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/31  16:18
 **/
public class HouseOne extends HouseTemplate {
    protected HouseOne(String name,boolean isBuildToilet) {
       super(name,isBuildToilet);

    }

    @Override
    protected void buildDoor() {
        System.out.println(name+"做成防盗门");
    }

    @Override
    protected void buildWindow() {
        System.out.println(name+"做成防盗窗");

    }

    @Override
    protected void buildRoom() {
        System.out.println(name+"做成3室");

    }

    @Override
    protected void buidToilet() {
        System.out.println(name+"修厕所");
    }

    @Override
    public boolean isBuildToilet() {
       return isBuildToilet;

    }
}
