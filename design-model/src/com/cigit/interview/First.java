package com.cigit.interview;

/**
 * @Author:zhuzhou
 * @Date: 2019/12/4  11:29
 * 面试题,i++与++i区别
 **/
public class First {
    public static void main(String[] args) {
        int i = 1;
        i = i++;  //先执行=右边的运算，将1压入栈中，在执行i++，执行完后i=2，最后将栈中的1赋值给i，最后i=1
        int j = i++;
        int k = i+ ++i*i++;//2+3*3
        System.out.println("i=\t"+i);
        System.out.println("j=\t"+j);
        System.out.println("k=\t"+k);
    }
}
