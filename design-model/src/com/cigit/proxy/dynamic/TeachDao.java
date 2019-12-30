package com.cigit.proxy.dynamic;


/**
 * @Author:zhuzhou
 * @Date: 2019/10/30  9:38
 * 目标类
 * jdk动态代理中，若在一个方法（方法1）中调用同一个类的另一个方法（方法2），方法2的代理失效
 **/
public class TeachDao  implements ITeachDao{
    @Override
    public void teach() {

        System.out.println("老师正在上课.....");
        noTeach();
    }

    @Override
    public void noTeach() {
        System.out.println("老师没有在上课.........");
    }


}
