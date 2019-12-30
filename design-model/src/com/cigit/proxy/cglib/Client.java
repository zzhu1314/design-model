package com.cigit.proxy.cglib;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/30  15:16
 **/
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        TeacherDao proxyInstance = (TeacherDao) proxyFactory.getProxyInstance();
        proxyInstance.teach("张三");
        proxyInstance.noTeach();
    }
}
