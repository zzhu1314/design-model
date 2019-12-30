package com.cigit.proxy.dynamic;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/30  9:44
 **/
public class Client {
    public static void main(String[] args) {
        ITeachDao teachDao = new TeachDao();
        ProxyFactory proxyFactory = new ProxyFactory(teachDao);
        ITeachDao proxyInstance = (ITeachDao) proxyFactory.getProxyInstance();
        proxyInstance.teach();
        //proxyInstance.noTeach();


    }
}
