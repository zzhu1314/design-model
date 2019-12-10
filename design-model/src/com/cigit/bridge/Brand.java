package com.cigit.bridge;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/22  14:19
 * 桥接口，（目的方，最终要达到的行为）
 **/
public interface Brand {

    void open();
    void close();
    void call();
}
