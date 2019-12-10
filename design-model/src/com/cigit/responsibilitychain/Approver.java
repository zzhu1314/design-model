package com.cigit.responsibilitychain;

/**
 * 请求的抽象执行者
 * @Author:zhuzhou
 * @Date: 2019/11/12  14:10
 **/
public abstract class Approver {

    protected Approver approver;//自己依赖下一级
    protected String name;//执行者名字

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }
    public abstract void processRequest(ProccessRequest proccessRequest);
}
