package com.cigit.prototype.deep;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/14  14:46
 **/
public class DeepPrototype implements Serializable,Cloneable {
    private String name;
    private DeepCloneTargetType deepCloneTargetType;

    public DeepPrototype(String name, DeepCloneTargetType deepCloneTargetType) {
        this.name = name;
        this.deepCloneTargetType = deepCloneTargetType;
    }

    public DeepPrototype() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneTargetType getDeepCloneTargetType() {
        return deepCloneTargetType;
    }

    public void setDeepCloneTargetType(DeepCloneTargetType deepCloneTargetType) {
        this.deepCloneTargetType = deepCloneTargetType;
    }

    //方式一：将引用类型也实现cloneable接口
    @Override
    public Object clone() {
        DeepPrototype deep = null;
        try {
            deep = (DeepPrototype) super.clone();
            deep.deepCloneTargetType = (DeepCloneTargetType) deepCloneTargetType.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return deep;
    }
    //方式二：序列化
    public DeepPrototype deepClone(){
        ByteArrayOutputStream bos;
        ByteArrayInputStream bis;
        ObjectInputStream ois;
        ObjectOutputStream oos;
        try{
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepPrototype result = (DeepPrototype)ois.readObject();
            return result;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
