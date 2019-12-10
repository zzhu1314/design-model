package com.cigit.interview;

/**
 * @Author:zhuzhou
 * @Date: 2019/12/5  10:12
 * 面试题，局部变量与成员变量
 * 就近原则：每个变量会找与它最近的变量
 * 静态成员变量分配在方法区，属于类（只会初始化一次），所有对象共享；
 * 普通成员变量（实例变量）分配在堆，属于对象（没生成一个对象初始化一次）；
 * 局部变量分配在栈
 * 在方法体和代码块（普通和静态）内都是局部变量
 * 栈中的值共享，如 int a =3，int b = 3（a,b都为局部变量），a和b都同时指向3
 * 堆不共享（每次都会分配新的内存空间）
 **/
public class Second {
    static int s;//类变量，引用和值都存储于方法区，若为引用类型，对象存储于堆，引用存储于方法区
    int j;//成员变量，引用j和默认值0都存储于堆
    int i;//成员变量

    static{
        int s = 1;
        s++;
    }


    {
        int i = 1;//局部变量，生命周期伴随{}结束，是基本类型，引用和值都存储在栈中，值1对栈中的引用共享
        i++;
        j++;
        s++;
    }

    public void test(int j) {
        j++;
        i++;
        s++;
    }

    /**
     * 值传递，引用传递
     * java只有值传递（拷贝副本）
     * 传递基本类型，是传递的值
     * 传递引用类型，是传递的地址
     * String与Integer是不可变类型
     * @param j
     * @param num
     * @param array
     * @param myData
     */
    public void change(int j, Integer num, int[] array, MyData myData) {


    }

    public static void main(String[] args) {//局部变量
        Second second1 = new Second();//局部变量，引用存储指向对象的地址，存储在栈，对象存储在堆
        Second second2 = new Second();//局部变量
        second1.test(10);//i=1,j=1,s=2
        second1.test(10);//i=2,j=1,s=3
        second2.test(10);//i=3,j=1,s=2
        System.out.println("second1.i="+second1.i+"\tsecond1.j="+second1.j+"\tsecond1.s="+second1.s);
        System.out.println("second2.i="+second2.i+"\tsecond2.j="+second2.j+"\tsecond2.s="+second2.s);
    }
}

class MyData {
    int s = 10;
}
