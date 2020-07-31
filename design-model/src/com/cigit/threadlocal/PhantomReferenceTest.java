package com.cigit.threadlocal;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * @Description:
 * @Author:zhuzhou
 * @Date: 2020/7/22 10:28
 * 虚引用
 **/
public class PhantomReferenceTest {
    public static void main(String[] args) {
        //personPhantomReference是强引用，里面有有个虚引用指向了Person对象，但get不到
        //若触发了垃圾回收Person对象被回收，触发系统通知到ReferenceQueue队列中
        //就是在这个对象被垃圾回收器回收的时候 会触发一个系统通知或者后续添加做进一步的处理，要跟ReferenceQueue一起使用
        //java的finalize()类似
        //可做堆外内存回收
        ReferenceQueue<Person> referenceQueue = new ReferenceQueue<>();
        PhantomReference<Person> personPhantomReference=new PhantomReference<>(new Person(),referenceQueue);
        new Thread(()->{
            System.out.println(personPhantomReference.get()+"===");
            System.gc();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            while (true) {
                if (personPhantomReference.isEnqueued()) {
                    System.out.println(referenceQueue.poll());
                }
            }
        }).start();
    }
}
