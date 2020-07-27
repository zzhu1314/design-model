package com.cigit.threadlocal;

import java.lang.ref.WeakReference;

/**
 * @Description:
 * @Author:zhuzhou
 * @Date: 2020/7/22 10:12
 **/
public class WeakReferenceTest {
    public static void main(String[] args) throws InterruptedException {
        //weakReference是强引用，里面有一个弱引用指向了Person对象，一遇到垃圾回收期 就会被回收
        WeakReference<Person> weakReference = new WeakReference<>(new Person());
        System.out.println(weakReference.get());
        System.gc();
        //Thread.sleep(100);
        System.out.println(weakReference.get());
    }
}
