package com.cigit.adapter.objectadapter;

import com.cigit.adapter.classadapter.IVolatage5V;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/18  10:14
 * 适配器
 **/
public class VolatageAdapter implements  IVolatage5V{
    private Voltage220V voltage220V ;//聚合
    public VolatageAdapter(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }

    @Override
    public int outPut5V() {
        int dis = voltage220V.outPut220V()/44;
        System.out.println("适配器转化输出"+dis+"V");
        return dis;
    }
}
