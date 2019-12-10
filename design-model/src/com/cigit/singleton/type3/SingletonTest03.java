package com.cigit.singleton.type3;


/**
 * @Author:zhuzhou
 * @Date: 2019/9/30  15:35
 * 懒汉式（线程不安全）
 **/
public class SingletonTest03 {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            new Thread(()-> System.out.println(SingletonTest03.getInstance())).start();
        }
    }

    private SingletonTest03(){

    }

    private  static SingletonTest03 instance = null;

    public static SingletonTest03 getInstance(){

        if(instance==null){
            instance = new SingletonTest03();
        }
        return  instance;
    }
}
