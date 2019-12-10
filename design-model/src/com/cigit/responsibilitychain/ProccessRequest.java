package com.cigit.responsibilitychain;

/**
 * 请求
 * @Author:zhuzhou
 * @Date: 2019/11/12  14:10
 **/
public class ProccessRequest {
    private int id;
    private float price;//金额
    public ProccessRequest(int id, float price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


}
