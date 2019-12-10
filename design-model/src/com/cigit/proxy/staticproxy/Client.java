package com.cigit.proxy.staticproxy;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/30  9:33
 **/
public class Client {
    public static void main(String[] args) {
        ITeach iTeach = new TeachDao();
        TeachProxy teachProxy = new TeachProxy(iTeach);
        teachProxy.teach();
    }
}
