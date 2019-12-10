package com.cigit.factory;

import java.util.Calendar;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/12  15:51
 **/
public class Application {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Calendar instance = Calendar.getInstance();
        Calendar calendar = instance.getClass().newInstance();
    }
}
