package com.cigit.prototype.deep;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/14  15:57
 **/
public class Client {
    public static void main(String[] args) {
        DeepPrototype deepPrototype = new DeepPrototype();
        deepPrototype.setDeepCloneTargetType(new DeepCloneTargetType("李飞"));
        deepPrototype.setName("主任");
        DeepPrototype deepPrototype1 = deepPrototype.deepClone();
        DeepPrototype deepPrototype2 = deepPrototype.deepClone();

        System.out.println(deepPrototype.getDeepCloneTargetType().hashCode());
        System.out.println(deepPrototype1.getDeepCloneTargetType().hashCode());
        System.out.println(deepPrototype2.getDeepCloneTargetType().hashCode());
    }
}
