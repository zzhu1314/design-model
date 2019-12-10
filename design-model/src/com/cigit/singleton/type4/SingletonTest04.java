package com.cigit.singleton.type4;


import java.util.concurrent.TimeUnit;

/**
 * @Author:zhuzhou
 * @Date: 2019/9/30  15:44
 * 懒汉式（安全）
 **/
public class SingletonTest04 {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            new Thread(()-> {
                try {
                    System.out.println(SingletonTest04.getInstance());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
    private SingletonTest04(){

    }
    private static  SingletonTest04 instance = null;
    public static  synchronized SingletonTest04 getInstance() throws InterruptedException {
         if(instance==null){
             TimeUnit.SECONDS.sleep(1);
             instance = new SingletonTest04();
         }
         return instance;
    }
}
