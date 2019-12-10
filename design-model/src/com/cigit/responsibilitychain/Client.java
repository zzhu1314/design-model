package com.cigit.responsibilitychain;

/**
 * 处理者循环依赖
 * @Author:zhuzhou
 * @Date: 2019/11/12  14:19
 **/
public class Client {
    public static void main(String[] args) {
        ProccessRequest proccessRequest = new ProccessRequest(11, 40000);
        DepartmentApprover departmentApprover = new DepartmentApprover("张部长");
        ColleageApprover colleageApprover = new ColleageApprover("王院长");
        ViceMasterApprover viceMasterApprover = new ViceMasterApprover("陈副校长");
        MasterApprover masterApprover = new MasterApprover("朱校长");

        //循环依赖
        departmentApprover.setApprover(colleageApprover);
        colleageApprover.setApprover(viceMasterApprover);
        viceMasterApprover.setApprover(masterApprover);
        masterApprover.setApprover(departmentApprover);
        colleageApprover.processRequest(proccessRequest);
        masterApprover.processRequest(proccessRequest);
    }
}
