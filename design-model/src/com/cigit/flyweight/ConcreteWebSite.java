package com.cigit.flyweight;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/29  16:14
 * 具体享元类
 **/
public class ConcreteWebSite extends WebSite {
    private String type;//内部状态
    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站类型为:"+type+"正在使用 \t"+"使用者:"+user.getName());
    }
}
