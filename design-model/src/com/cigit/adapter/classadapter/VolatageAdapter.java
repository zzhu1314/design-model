package com.cigit.adapter.classadapter;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/18  10:14
 * 适配器
 **/
public class VolatageAdapter extends Voltage220V implements  IVolatage5V{

    @Override
    public int outPut5V() {
        int dis = outPut220V()/44;
        System.out.println("适配器转化输出"+dis+"V");
        return dis;
    }
}
