package com.cigit.responsibilitychain;

/**
 * 学院处理者
 * @Author:zhuzhou
 * @Date: 2019/11/12  14:16
 **/
public class ColleageApprover extends Approver {
    public ColleageApprover(String name) {
        super(name);
    }
    @Override
    public void processRequest(ProccessRequest proccessRequest) {
        if(proccessRequest.getPrice()>5000&&proccessRequest.getPrice()<=10000){
            System.out.println("id="+proccessRequest.getId()+"金额为"+proccessRequest.getPrice()+"\t的请求被"+this.name+"处理了...");
        }else {
            approver.processRequest(proccessRequest);
        }
    }
}
