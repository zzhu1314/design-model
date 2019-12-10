package com.cigit.decorate.demo2;

import org.junit.runner.notification.Failure;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/5  17:44
 **/
public class Falchion extends Equipment {
    public Falchion(LeagueOfLegends leagueOfLegends){
        super(leagueOfLegends);
        super.setName("青龙刀");
    }

}
