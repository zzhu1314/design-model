package com.cigit.responsibilitychain;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/12  14:18
 **/
public class ViceMasterApprover extends Approver {
    public ViceMasterApprover(String name) {
        super(name);
    }
    @Override
    public void processRequest(ProccessRequest proccessRequest) {
        if(proccessRequest.getPrice()>10000&&proccessRequest.getPrice()<=30000){
            System.out.println("id="+proccessRequest.getId()+"金额为"+proccessRequest.getPrice()+"\t的请求被"+this.name+"处理了...");
        }else {
            approver.processRequest(proccessRequest);
        }
    }
}
