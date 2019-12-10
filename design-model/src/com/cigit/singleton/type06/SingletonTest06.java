package com.cigit.singleton.type06;

/**
 * @Author:zhuzhou
 * @Date: 2019/9/30  16:05
 * 静态类部类
 **/
public class SingletonTest06 {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
    }
}

class Singleton {
    private Singleton() {

    }

    private static int a = 10;

    //内部类的不随外部类的加载而加载，保证了懒加载
    private static class InnerClass {
        static Singleton singleton = new Singleton();//静态成员变量只会在类加载的时候，加载一次，保证了线程安全

    }

    public static Singleton getInstance() {
        return InnerClass.singleton;
    }

}
