package com.cigit;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/7  9:05
 * interrupt：设置中断标志,并不会真正中断
 * isInterrupted：获取线程中断标志,是非静态函数，作用目标是“线程实例”
 * interrupted：获取线程中断标志,清除中断状态（true-->false;false-->true）
 * 只有当前线程（非静态方法，调用B线程的线程-主线程）才能清除自己的状态位
 **/
public class ThreadInterruptDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("isInterrupt--1" + Thread.currentThread().isInterrupted());
           while (true){

           }
        }, "a");
        thread.start();
        thread.interrupt();
        Thread.sleep(3000);
        //设置中断标志,并不会中断，中断操作抛异常，return

        //Thread.sleep(3000);
        //Thread.interrupted();
        Thread.currentThread().interrupt();
        System.out.println("isInterrupt--2" + thread.interrupted());//获取中断状态。并清除标记
        System.out.println("isInterrupt--3" + Thread.interrupted());
        System.out.println("isInterrupt--4" + thread.isInterrupted());



    }
}
