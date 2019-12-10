package com.cigit.decorate.demo2;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/5  17:53
 **/
public class Client {

    public static void main(String[] args) {
        LeagueOfLegends firePao = new FirePao(new Jax());
        LeagueOfLegends falchion = new Falchion(firePao);
        firePao.display();
        falchion.display();
    }
}
