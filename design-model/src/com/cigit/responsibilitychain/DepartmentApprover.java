package com.cigit.responsibilitychain;

/**
 * 部门处理者
 * @Author:zhuzhou
 * @Date: 2019/11/12  14:13
 **/
public class DepartmentApprover extends Approver {
    public DepartmentApprover(String name) {
        super(name);
    }
    @Override
    public void processRequest(ProccessRequest proccessRequest) {
          if(proccessRequest.getPrice()<=5000){
              System.out.println("id="+proccessRequest.getId()+"金额为"+proccessRequest.getPrice()+"\t的请求被"+this.name+"处理了...");
          }else {
              approver.processRequest(proccessRequest);
          }
    }
}
