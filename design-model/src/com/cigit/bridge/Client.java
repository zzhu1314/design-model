package com.cigit.bridge;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/22  14:29
 **/
public class Client {
    public static void main(String[] args) {
        Phone xmPhone = new FoldedPhone(new XiaoMi());
        xmPhone.open();
        xmPhone.close();
        xmPhone.call();
        System.out.println("====================");
        Phone vvoPhone = new FoldedPhone(new Vivo());
        vvoPhone.open();
        vvoPhone.close();
        vvoPhone.call();
    }
}
