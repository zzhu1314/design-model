package com.cigit.builder;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/17  17:41
 * 指挥者
 **/
public class Director {
    IHumanBuilder iHumanBuilder;
    public Director(IHumanBuilder iHumanBuilder){
        this.iHumanBuilder = iHumanBuilder;//指挥者者聚合了具体的创建者
    }

    public Human buidHuman(){
        iHumanBuilder.buidHead();
        iHumanBuilder.buildBody();
        iHumanBuilder.buidHand();
        iHumanBuilder.buildFoot();
        return iHumanBuilder.buildHuman();
    }
}
