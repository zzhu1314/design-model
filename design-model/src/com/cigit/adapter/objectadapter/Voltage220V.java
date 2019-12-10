package com.cigit.adapter.objectadapter;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/18  10:11
 * 被适配的类
 **/
public class Voltage220V {

    public int outPut220V(){
        int src = 220;
        System.out.println("输出电压:"+220+"V");
        return src;
    }
}
