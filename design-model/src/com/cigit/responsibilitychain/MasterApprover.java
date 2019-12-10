package com.cigit.responsibilitychain;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/12  14:19
 **/
public class MasterApprover extends Approver {
    public MasterApprover(String name) {
        super(name);
    }
    @Override
    public void processRequest(ProccessRequest proccessRequest) {
        if(proccessRequest.getPrice()>30000){
            System.out.println("id="+proccessRequest.getId()+"金额为"+proccessRequest.getPrice()+"\t的请求被"+this.name+"处理了...");
        }else {
            approver.processRequest(proccessRequest);
        }
    }
}
