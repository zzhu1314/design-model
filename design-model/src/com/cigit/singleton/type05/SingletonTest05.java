package com.cigit.singleton.type05;


import java.util.concurrent.TimeUnit;

/**
 * @Author:zhuzhou
 * @Date: 2019/9/30  15:50
 * 双重检验锁
 **/
public class SingletonTest05 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    System.out.println(SingletonTest05.getInstance());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    private SingletonTest05() {

    }

    private volatile static SingletonTest05 instance = null;

    public static SingletonTest05 getInstance() throws InterruptedException {
        if (instance == null) {
            synchronized (SingletonTest05.class) {
                if (instance == null) {
                    TimeUnit.SECONDS.sleep(1);
                    synchronized (SingletonTest05.class) {
                        //创建对象的过程，先判断该类是否被加载，若加载则进行创建对象
                        //创建对象：1.为分配内存地址，2.为对象赋默认值，3.初始化对象，赋值，4.将对象的引用，指向对象的内存地址，
                        //3和4的步骤不存在依赖关系，jvm在执行编译指令时，有可能会发生指令重排序。先执行4，在执行3，此时内存地址不为null，instance==null则为false
                        //单列创建会出现问题
                        instance = new SingletonTest05();
                    }
                }
            }
        }
        return instance;
    }
}
