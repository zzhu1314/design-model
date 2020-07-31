package com.cigit.threadlocal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * @Description:
 * @Author:zhuzhou
 * @Date: 2020/7/27 14:26
 * 引用队列:在GC前会将对象保存在引用队列中
 **/
public class ReferenceQueueTest {
    public static void main(String[] args) throws InterruptedException {
        ReferenceQueue<Object> objectReferenceQueue = new ReferenceQueue<>();
        Object object = new Object();
        WeakReference<Object> weakReference = new WeakReference<>(object,objectReferenceQueue);
        System.out.println(weakReference.get());
        System.out.println(objectReferenceQueue.poll());
        System.out.println("====================");

        object=null;
        System.gc();
        Thread.sleep(500);
        System.out.println(weakReference.get());
        System.out.println(objectReferenceQueue.poll());//GC时将对象保存在引用队列中

    }
}
