package com.cigit.singleton.type1;

/**
 * @Author:zhuzhou
 * @Date: 2019/9/30  15:21
 * 饿汉式
 **/
public class SingletonTest01 {
    public static void main(String[] args) {
        System.out.println(SingletonTest01.getInstance());
        System.out.println(SingletonTest01.getInstance());
        System.out.println(SingletonTest01.getInstance());
    }
    //构造函数私有化，不准外部new
    private SingletonTest01(){

    }
    //本类创建对象实例
    private final  static SingletonTest01 instance = new SingletonTest01();
    //提供一个公有的静态方法，返回实例对象
    public static SingletonTest01 getInstance(){
        return instance;
    }
}
