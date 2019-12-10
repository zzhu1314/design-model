package com.cigit.decorate.demo2;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/5  17:40
 **/
public abstract class Equipment extends LeagueOfLegends {

    public String name;
    LeagueOfLegends leagueOfLegends;
    public Equipment(LeagueOfLegends leagueOfLegends){
        this.leagueOfLegends = leagueOfLegends;
    }
    public String getName(){
        return super.getName()+"装备给"+leagueOfLegends.getName();
    }
    @Override
    public void display() {
        System.out.println(super.getName()+leagueOfLegends.getName());
    }

}
