package com.cigit.threadlocal;

import java.lang.ref.SoftReference;

/**
 * @Description:
 * @Author:zhuzhou
 * @Date: 2020/7/22 9:57
 **/
public class SoftReferenceTest {
    public static void main(String[] args) {
        SoftReference<byte[]> softReference = new SoftReference<>(new byte[1024*1024*10]);
        //softReference是一个强引用，但这个强引用里面有一个软引用指向了 byte[]数组
        //若内存不够触发垃圾回收时，就会被回收，适用于做缓存
           System.out.println(softReference.get());
           System.gc();
           try {
               Thread.sleep(500);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println(softReference.get());
           byte[] bytes= new byte[1024*1024*9];
           System.out.println(softReference.get());

    }
}
