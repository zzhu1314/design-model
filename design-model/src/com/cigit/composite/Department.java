package com.cigit.composite;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/28  14:44
 * 叶子节点部门
 **/
public class Department extends OrganizationComponent {
    public Department(String name, String dec) {
        super(name, dec);
    }

    @Override
    protected void print() {
        System.out.println("--------------" + getName() + "--------------");
    }
}
