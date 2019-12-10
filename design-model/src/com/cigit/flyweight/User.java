package com.cigit.flyweight;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/29  16:27
 * 外部状态
 **/
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
