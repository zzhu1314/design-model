package com.cigit.threadlocal;

import java.util.WeakHashMap;

/**
 * @Description:
 * @Author:zhuzhou
 * @Date: 2020/7/22 10:39
 * 1.Thread线程对象内部有一个ThreadLocal.ThreadLocalMap threadLocals全部变量  所以ThreadLocal是每个线程私有的
 * 2.threadLocal在set（）时 会先获取当前线程，并获取线程里的threadLocals变量，此时ThreadLocalMap的key为threadLocal，value为set的值
 * 3.ThreadLocal有一个内部类ThreadLocalMap，ThreadLocalMap也有一个内部类Entry，Entry继承自WeakReference
 *  最后存储的代码  tab[i] = new Entry(key, value); super(k);
 *  4.即ThreadLocal被一个弱引用所指向，当gc时ThreadLocal就会被回收，但value不会被回收
 *
 *
 *  用途：在spring的事务管理中，ThreadLocal用来存储Connection连接，保证在同一线程下的Connection是相同的，才能进行事务回滚
 *  WeakHashMap跟ThreadLocal类似
 **/
public class ThreadLocalTest {
    public static void main(String[] args) {
        ThreadLocal<Person> threadLocal = new ThreadLocal<>();
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"\t"+threadLocal.get());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"\t"+threadLocal.get());
        }).start();



        new Thread(()->{
            threadLocal.set(new Person());
            threadLocal.remove();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"\t"+threadLocal.get());
        }).start();
    }

    public static  void myWeakHashMap(){
        WeakHashMap<Integer, Object> m = new WeakHashMap<>();
        Integer i = new Integer(2);
        m.put(i,new Object());
        System.out.println(m);

        //i=null; 只有当i为null，没有强引用指向Integer，gc触发时key作为被软引用指向的对象，才会被回收
        //此时的value并不会被回收，这里会监听ReferenceQueue队列，把Entry.value=null，这里处理的value的Gc
        System.gc();
        System.out.println(m);
    }
}
