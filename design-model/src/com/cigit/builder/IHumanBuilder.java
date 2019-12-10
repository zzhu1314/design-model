package com.cigit.builder;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/17  17:37
 * 抽象的构造者
 **/
public interface IHumanBuilder {
    void buidHead();
    void buildBody();
    void buidHand();
    void buildFoot();
    Human buildHuman();
}
