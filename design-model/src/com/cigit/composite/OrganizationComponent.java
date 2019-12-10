package com.cigit.composite;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/28  14:31
 * 抽象组件(可以是接口也可以使类)
 * component：容器，将子节点的公共属性跟公共行为抽象出来
 * 如：增加节点，删除节点，获取节点
 **/
public abstract class OrganizationComponent {

    private String name;
    private String dec;

    public OrganizationComponent(String name, String dec) {
        this.name = name;
        this.dec = dec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    //默认实现，叶子节点不能操作
    protected  void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }
    protected  void removed(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }
    protected abstract void print();
}
