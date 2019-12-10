package com.cigit.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/28  14:35
 * 容器（Composite），可以管理College;
 **/
public class University extends OrganizationComponent {
    List<OrganizationComponent> list = new ArrayList<>();

    public University(String name, String dec) {
        super(name, dec);
    }
    @Override
    protected void add(OrganizationComponent organizationComponent) {
         list.add(organizationComponent);
    }

    @Override
    protected void removed(OrganizationComponent organizationComponent) {
      list.remove(organizationComponent);
    }

    //输出大学包含学院的名字
    @Override
    protected void print() {
        System.out.println("--------------" + getName() + "--------------");
        for (OrganizationComponent organizationComponent : list) {
            organizationComponent.print();
        }
    }
}
