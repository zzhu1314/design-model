package com.cigit.prototype.improve;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/14  9:31
 * 原型模式 浅拷贝
 * 如果在没有实现Cloneable 接口的实例上调用 Object 的 clone 方法，
 * 则会导致抛出 CloneNotSupportedException 异常。
 **/
public class Sheep implements Cloneable {
    private String name;
    private String age;
    private String color;

    public Sheep(String name, String age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Sheep() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    protected Object clone()  {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }
}
