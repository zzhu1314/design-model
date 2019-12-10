package com.cigit.proxy.staticproxy;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/30  9:18
 * 代理类与目标类实现相同的接口，并聚合目标类
 **/
public class TeachProxy implements ITeach{
    private ITeach iTeach;

    public TeachProxy(ITeach iTeach) {
        this.iTeach = iTeach;
    }

    @Override
    public void teach() {
        System.out.println("老师走进来。。。。");
        iTeach.teach();
        System.out.println("老师下课了.....");
    }
}
