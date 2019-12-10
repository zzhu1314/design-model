package com.cigit.decorate.demo2;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/5  17:33
 **/
public abstract class LeagueOfLegends {

   public  String name;
    //装扮
   abstract void display();
   public void setName(String name){
        this.name = name;
    }
    public String getName(){
       return  name;
    }
}
