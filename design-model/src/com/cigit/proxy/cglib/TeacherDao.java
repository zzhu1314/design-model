package com.cigit.proxy.cglib;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/30  15:01
 * cglib代理，若在同一个类中方法1调用方法2，方法1和方法2被看成一个方法，被代理
 **/
public class TeacherDao {
    public void teach(String name)
    {
        System.out.println(name+"老师正在上课.....");
        noTeach();
    }
    public void noTeach() {
        System.out.println("老师没有在上课.........");
    }
}
