package com.cigit.builder;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/17  17:45
 **/
public class Client {
    public static void main(String[] args) {
        Director director = new Director(new SmartHumanBuilder());
        Human human = director.buidHuman();
        System.out.println(human);
    }
}
