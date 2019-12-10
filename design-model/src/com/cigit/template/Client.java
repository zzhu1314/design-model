package com.cigit.template;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/31  16:22
 **/
public class Client {
    public static void main(String[] args) {

        HouseTemplate houseOne = new HouseOne("白宫",true);
        HouseTemplate houseTwo = new HouseTwo("金三角",false);
        houseOne.build();
        houseTwo.build();
    }
}
