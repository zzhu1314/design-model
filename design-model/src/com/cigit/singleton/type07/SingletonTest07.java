package com.cigit.singleton.type07;

/**
 * @Author:zhuzhou
 * @Date: 2019/9/30  16:24
 * 枚举实现单列
 **/
public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1==instance2);
        instance1.lock();
    }

}

enum  Singleton{
    INSTANCE;
    public void lock(){
        System.out.println("i am a lock");
    }
}
