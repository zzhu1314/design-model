package com.cigit.builder;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/17  17:39
 * 具体的构建者
 **/
public class SmartHumanBuilder implements IHumanBuilder {
    Human human;

    public SmartHumanBuilder() {
        human = new Human();//构建者组合了产品，同生共死
    }

    @Override
    public void buidHead() {
        human.setHead("创建了超人的脑袋");

    }

    @Override
    public void buildBody() {
        human.setBody("创建了超人的身体");

    }

    @Override
    public void buidHand() {
        human.setHand("创建了超人的手");
    }

    @Override
    public void buildFoot() {
        human.setFoot("创建了超人的脚");
    }

    @Override
    public Human buildHuman() {
        return human;//创建超人
    }

}
