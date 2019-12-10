package com.cigit.interview;

/**
 * @Author:zhuzhou
 * @Date: 2019/12/5  10:43
 * 类加载顺序
 * 先执行父类静态代码块，静态成员变量（按顺序加载）---》
 * 子类静态代码块，静态成员变量（按顺序加载）---》
 * 父类普通代码块，实例变量（按顺序加载），构造函数（最后执行）--》
 * 子类普通代码块，实例变量（按顺序加载），构造函数（最后执行）
 **/
public class Father {
    public int i= 1;
    static {
        System.out.println("1");
    }
    {
        System.out.println("2");
        test();//因为子类重写了父类的方法，test()==this.test(),this代表的是当前对象Son，所以执行结果为8
    }
    public Father(){
        System.out.println("3");
    }
    public void test(){
        System.out.println(4);
    }

    public static void main(String[] args) {
        Son son = new Son();
    }
}
class Son extends  Father{
    static {
        System.out.println("5");
    }
    {
        System.out.println("6");
        test();
    }
    public Son(){
        System.out.println("7");
    }
    public void test(){
        System.out.println(8);
    }
}
