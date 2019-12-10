package com.cigit.prototype.deep;

import java.io.Serializable;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/14  14:39
 * 深拷贝目标类
 **/
public class DeepCloneTargetType implements Serializable,Cloneable {
    private String name;

    public DeepCloneTargetType() {
    }

    public DeepCloneTargetType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DeepCloneTargetType{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
