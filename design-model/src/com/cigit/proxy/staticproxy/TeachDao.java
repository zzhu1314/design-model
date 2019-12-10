package com.cigit.proxy.staticproxy;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/30  9:17
 * 目标类
 **/
public class TeachDao implements ITeach {
    @Override
    public void teach() {
        System.out.println("老师正在上课.....");
    }
}
