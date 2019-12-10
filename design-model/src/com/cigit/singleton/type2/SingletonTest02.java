package com.cigit.singleton.type2;

/**
 * @Author:zhuzhou
 * @Date: 2019/9/30  15:30
 * 饿汉式（静态代码块）
 **/
public class SingletonTest02 {
    public static void main(String[] args) {
        System.out.println(SingletonTest02.getInstance());
        System.out.println(SingletonTest02.getInstance());
        System.out.println(SingletonTest02.getInstance());
    }
    private SingletonTest02(){

    }
    private final  static SingletonTest02 instance;
    //实例对象放在静态代码块创建
    static {
        instance = new SingletonTest02();
    }
    //提供一个公有的静态方法，返回实例对象
    public static SingletonTest02 getInstance(){
        return instance;
    }
}
