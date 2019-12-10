package com.cigit.composite;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/28  14:45
 **/
public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学", "清华大学");

        OrganizationComponent college1 = new College("信息工程学院", "信息工程学院");
        OrganizationComponent college2= new College("计算机学院", "计算机学院");
        OrganizationComponent college3= new College("软件工程学院", "软件工程学院");
        university.add(college1);
        university.add(college2);
        university.add(college3);
        OrganizationComponent department1 = new Department("电子工程", "电子工程");
        OrganizationComponent department2 = new Department("计算机专业", "计算机");
        OrganizationComponent department3 = new Department("软件编程专业", "软件编程专业");
        college1.add(department1);
        college2.add(department2);
        college3.add(department3);
        university.print();
    }
}
