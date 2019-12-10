package com.cigit.prototype.improve;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/14  9:34
 **/
public class Client {
    public static void main(String[] args) {
        Sheep sheep1 = new Sheep("sheep", "21", "白色");
        Sheep sheep2 = (Sheep) sheep1.clone();
        Sheep sheep3 = (Sheep) sheep1.clone();
        Sheep sheep4 = (Sheep) sheep1.clone();
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);

    }
}
