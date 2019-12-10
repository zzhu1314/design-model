package com.cigit.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/28  14:37
 * 子容器（Composite），管理Department
 **/
public class College extends OrganizationComponent {
    private List<OrganizationComponent> list = new ArrayList<>();
    public College(String name, String dec) {
        super(name, dec);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        list.add(organizationComponent);
    }

    @Override
    protected void removed(OrganizationComponent organizationComponent) {
        list.add(organizationComponent);
     }

     //递归输出学院包含的专业的名字
    @Override
    protected void print() {
        System.out.println("--------------" + getName() + "--------------");
        for (OrganizationComponent organizationComponent : list) {
            organizationComponent.print();
        }
    }
}
