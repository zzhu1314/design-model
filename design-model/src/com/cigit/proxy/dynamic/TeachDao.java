package com.cigit.proxy.dynamic;


/**
 * @Author:zhuzhou
 * @Date: 2019/10/30  9:38
 * 目标类
 **/
public class TeachDao  implements ITeachDao{
    @Override
    public void teach() {
        System.out.println("老师正在上课.....");
    }


}
