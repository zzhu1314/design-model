package com.cigit.adapter.objectadapter;

import com.cigit.adapter.classadapter.IVolatage5V;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/18  10:17
 * 使用方
 **/
public class Phone {
    public void charge(IVolatage5V iVolatage5V){
        int dis = iVolatage5V.outPut5V();
        if(dis==5){
            System.out.println("电压5V，可以充电");
        }else {
            System.out.println("充电失败");

        }
    }
}
